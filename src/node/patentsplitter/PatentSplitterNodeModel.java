package node.patentsplitter;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.knime.core.data.DataCell;
import org.knime.core.data.DataColumnSpec;
import org.knime.core.data.DataColumnSpecCreator;
import org.knime.core.data.DataRow;
import org.knime.core.data.DataTableSpec;
import org.knime.core.data.RowKey;
import org.knime.core.data.StringValue;
import org.knime.core.data.container.DataContainer;
import org.knime.core.data.date.DateAndTimeCell;
import org.knime.core.data.def.BooleanCell;
import org.knime.core.data.def.DefaultRow;
import org.knime.core.data.def.IntCell;
import org.knime.core.data.def.JoinedRow;
import org.knime.core.data.def.StringCell;
import org.knime.core.data.uri.URIDataCell;
import org.knime.core.data.uri.URIDataValue;
import org.knime.core.data.uri.UriCellFactory;
import org.knime.core.node.BufferedDataTable;
import org.knime.core.node.CanceledExecutionException;
import org.knime.core.node.ExecutionContext;
import org.knime.core.node.ExecutionMonitor;
import org.knime.core.node.InvalidSettingsException;
import org.knime.core.node.NodeModel;
import org.knime.core.node.NodeSettingsRO;
import org.knime.core.node.NodeSettingsWO;
import org.knime.core.node.defaultnodesettings.SettingsModelInteger;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.PatentApi;
import patent.patentByCompound.model.Item;
import patent.patentByCompound.model.PatentByCompound;

/**
 * This is the model implementation of PatentSplitter.
 * 
 *
 * @author Patrick Penner
 */
public class PatentSplitterNodeModel extends NodeModel
{
  public static final String CFGKEY_COLUMN_NAME = "columnName";
  public static final String CFGKEY_APPID = "appId";
  public static final String CFGKEY_APPKEY = "appKey";

  private final SettingsModelString m_column = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_COLUMN_NAME, "");
  private final SettingsModelString m_appId = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_APPID, "861f498d");
  private final SettingsModelString m_appKey = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_APPKEY,
      "a4c4cfeafc60d525dd5b286906e21e06");

  // Search Settings
  public static final String CFGKEY_SCORE_OPERATOR = "scoreOperator";
  public static final String CFGKEY_SCORE = "score";
  public static final String CFGKEY_FREQUENCY_OPERATOR = "frequencyOperator";
  public static final String CFGKEY_FREQUENCY = "frequency";
  public static final String CFGKEY_PATENTS_PER_MOLECULE = "patentsPerMolecul";
  public static final String CFGKEY_CLASSIFICATION = "classification";
  public static final String CFGKEY_IN_TITLE = "inTitle";
  public static final String CFGKEY_IN_ABSRACT = "inAbstract";
  public static final String CFGKEY_IN_DESCRIPTION = "inDescription";
  public static final String CFGKEY_IN_CLAIMS = "inClaims";
  public static final String CFGKEY_IN_IMAGE = "inImage";
  public static final String CFGKEY_IN_CWU = "inCwu";

  private final SettingsModelString m_score_operator = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_SCORE_OPERATOR, ">=");
  private final SettingsModelInteger m_score = new SettingsModelInteger(
      PatentSplitterNodeModel.CFGKEY_SCORE, 0);
  private final SettingsModelString m_frequency_operator = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_FREQUENCY_OPERATOR, ">=");
  private final SettingsModelInteger m_frequency = new SettingsModelInteger(
      PatentSplitterNodeModel.CFGKEY_FREQUENCY, 0);
  private final SettingsModelInteger m_patentsPerMolecule = new SettingsModelInteger(
      PatentSplitterNodeModel.CFGKEY_PATENTS_PER_MOLECULE, 10);
  private final SettingsModelString m_classification = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_CLASSIFICATION, "");
  private final SettingsModelString m_inTitle = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_IN_TITLE, " ");
  private final SettingsModelString m_inAbstract = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_IN_ABSRACT, " ");
  private final SettingsModelString m_inDescription = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_IN_DESCRIPTION, " ");
  private final SettingsModelString m_inClaims = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_IN_CLAIMS, " ");
  private final SettingsModelString m_inImage = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_IN_IMAGE, " ");
  private final SettingsModelString m_inCwu = new SettingsModelString(
      PatentSplitterNodeModel.CFGKEY_IN_CWU, " ");

  /**
   * Constructor for the node model.
   */
  protected PatentSplitterNodeModel()
  {
    // in 0: table with URI
    // out 0: unmodified rows
    // out 1: rows with patents
    super(1, 2);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected BufferedDataTable[] execute(final BufferedDataTable[] inData,
      final ExecutionContext exec) throws Exception
  {
    // reading input columns
    DataTableSpec inputTableSpec = inData[0].getDataTableSpec();

    // creating patented outputTable
    DataTableSpec outputTableSpec = new DataTableSpec(inputTableSpec,
        createOutputSpec());

    // container recieves Not Found, patented container Patents Found
    DataContainer container = exec.createDataContainer(inputTableSpec);
    DataContainer patentedContainer = exec.createDataContainer(outputTableSpec);

    // creating API components outside of loop to pass to row processing
    ApiClient apiClient = new ApiClient();
    // TODO: version independent path
    apiClient.setBasePath("https://beta.openphacts.org/2.1");

    PatentApi patentApi = new PatentApi(apiClient);

    // location of the uri as index
    int colIndex = inputTableSpec.findColumnIndex(m_column.getStringValue());

    long rowCount = inData[0].size();
    long rowsProcessed = 0;
    // row index for rowkey creation
    long rowIndex = 0;
    // main row processing
    for (DataRow row : inData[0])
    {
      String uri = ((StringValue) row.getCell(colIndex)).getStringValue();

      // actual API call returns null if something goes wrong (Not Found /
      // Exception)
      PatentByCompound patentResponse = makeCall(patentApi, uri,
          m_appId.getStringValue().trim(), m_appKey.getStringValue().trim());

      if (patentResponse != null)
      {
        List<Item> patentList = patentResponse.getResult().getItems();
        for (Item item : patentList)
        {
          patentedContainer.addRowToTable(makeRow(rowIndex, item, row));
          rowIndex++;
        }
      }
      else
      {
        container.addRowToTable(row);
      }

      rowsProcessed++;

      // setting progress bar and message
      exec.setProgress((double) rowsProcessed / rowCount,
          " processing row " + (rowsProcessed + 1));
    }

    // creating not modified inputs table
    container.close();
    BufferedDataTable outputDataTable = exec
        .createBufferedDataTable(container.getTable(), exec);

    // creating input rows with patents table
    patentedContainer.close();
    BufferedDataTable patentedDataTable = exec
        .createBufferedDataTable(patentedContainer.getTable(), exec);

    return new BufferedDataTable[] { outputDataTable, patentedDataTable};

  }

  private DataTableSpec createOutputSpec()
  {
    // creating new ColumnSpecs
    DataColumnSpec[] newColumns = {
        new DataColumnSpecCreator("Patent ID", StringCell.TYPE).createSpec(),
        new DataColumnSpecCreator("Patent URI", URIDataCell.TYPE).createSpec(),
        new DataColumnSpecCreator("Date Published", DateAndTimeCell.TYPE)
            .createSpec(),
        new DataColumnSpecCreator("Title", StringCell.TYPE).createSpec(),
        new DataColumnSpecCreator("Relevance Score", IntCell.TYPE).createSpec(),
        new DataColumnSpecCreator("Frequency", IntCell.TYPE).createSpec(),
        new DataColumnSpecCreator("in Title", BooleanCell.TYPE).createSpec(),
        new DataColumnSpecCreator("in Abstract", BooleanCell.TYPE).createSpec(),
        new DataColumnSpecCreator("in Description", BooleanCell.TYPE)
            .createSpec(),
        new DataColumnSpecCreator("in Claims", BooleanCell.TYPE).createSpec(),
        new DataColumnSpecCreator("in Image", BooleanCell.TYPE).createSpec(),
        new DataColumnSpecCreator("in CWU", BooleanCell.TYPE).createSpec(),};

    return new DataTableSpec(newColumns);
  }

  private PatentByCompound makeCall(PatentApi patentApi, String uri,
      String appId, String appKey)
  {
    // prepares Settings, makes API call
    // return null on failure
    // Score filtering
    String scoreOperator = m_score_operator.getStringValue();
    Integer scoreValue = m_score.getIntValue();
    Integer minScore = null;
    Integer minExScore = null;
    Integer score = null;
    Integer maxExScore = null;
    Integer maxScore = null;

    if (scoreOperator.equals(">="))
    {
      minScore = scoreValue;
    }
    else if (scoreOperator.equals(">"))
    {
      minExScore = scoreValue;
    }
    else if (scoreOperator.equals("="))
    {
      score = scoreValue;
    }
    else if (scoreOperator.equals("<"))
    {
      maxExScore = scoreValue;
    }
    else if (scoreOperator.equals("<="))
    {
      maxScore = scoreValue;
    }

    // frequency filtering
    String frequencyOperator = m_frequency_operator.getStringValue();
    Integer frequencyValue = m_frequency.getIntValue();
    Integer minFrequency = null;
    Integer minExFrequency = null;
    Integer frequency = null;
    Integer maxExFrequency = null;
    Integer maxFrequency = null;

    if (frequencyOperator.equals(">="))
    {
      minFrequency = frequencyValue;
    }
    else if (frequencyOperator.equals(">"))
    {
      minExFrequency = frequencyValue;
    }
    else if (frequencyOperator.equals("="))
    {
      frequency = frequencyValue;
    }
    else if (frequencyOperator.equals("<"))
    {
      maxExFrequency = frequencyValue;
    }
    else if (frequencyOperator.equals("<="))
    {
      maxFrequency = frequencyValue;
    }

    // patent classification
    // test patent classification more
    String classification = null;
    if (!m_classification.getStringValue().trim().equals(""))
    {
      classification = m_classification.getStringValue().trim();
    }

    // Filtering by field in patent document
    Boolean title = null;
    if (m_inTitle.getStringValue().equals("True"))
    {
      title = true;
    }
    else if (m_inTitle.getStringValue().equals("False"))
    {
      title = false;
    }

    Boolean aBstract = null;
    if (m_inAbstract.getStringValue().equals("True"))
    {
      aBstract = true;
    }
    else if (m_inAbstract.getStringValue().equals("False"))
    {
      aBstract = false;
    }

    Boolean description = null;
    if (m_inDescription.getStringValue().equals("True"))
    {
      description = true;
    }
    else if (m_inDescription.getStringValue().equals("False"))
    {
      description = false;
    }

    Boolean claims = null;
    if (m_inClaims.getStringValue().equals("True"))
    {
      claims = true;
    }
    else if (m_inClaims.getStringValue().equals("False"))
    {
      claims = false;
    }

    Boolean image = null;
    if (m_inImage.getStringValue().equals("True"))
    {
      image = true;
    }
    else if (m_inImage.getStringValue().equals("False"))
    {
      image = false;
    }

    Boolean cwu = null;
    if (m_inCwu.getStringValue().equals("True"))
    {
      cwu = true;
    }
    else if (m_inCwu.getStringValue().equals("False"))
    {
      cwu = false;
    }

    PatentByCompound patentResponse = null;
    try
    {
      patentResponse = patentApi.patentByCompoundGet(uri, appId, appKey, score,
          minScore, minExScore, maxScore, maxExScore, frequency, minFrequency,
          minExFrequency, maxFrequency, maxExFrequency, classification, title,
          aBstract, description, claims, image, cwu, null, null,
          "DESC(?rel_score)", null, null, null);
    }
    catch (ApiException apiE)
    {
      // throws errors about converting xml to json when 404
      // apiE.printStackTrace();
    }

    return patentResponse;
  }

  private DataRow makeRow(long rowIndex, Item item, DataRow row)
  {
    RowKey rowKey = RowKey.createRowKey(rowIndex);

    // getting URI
    String patentUri = item.getAbout();

    // getting patentId from the last part of the URI
    String[] splitUri = patentUri.split("/");
    String patentId = splitUri[splitUri.length - 1];

    // getting date in a format to put in a cell
    String splitDateTime[] = item.getDatePublished().split("T");
    String splitDate[] = splitDateTime[0].split("-");

    // checking if patent returned a title and assigning, else Not Found
    String title = "Not Found";
    if (item.getTitle() != null)
    {
      title = item.getTitle();
    }

    // getting relevance score
    int relevanceScore = item.getRelevanceScore();

    // getting frequency
    int frequency = item.getFrequency();

    // getting Fields the entity is found in as booleans
    boolean inTitle = item.getOccursInPatentTitle();
    boolean inAbstract = item.getOccursInPatentAbstract();
    boolean inDescription = item.getOccursInPatentDescription();
    boolean inClaims = item.getOccursInPatentClaims();
    boolean inImage = item.getOccursInPatentImage();
    boolean inCwu = item.getOccursInPatentCWU();

    // creating Cells with the new information
    // BooleanCell creation is strange but according to docs I hope
    // http://tech.knime.org/docs/api/org/knime/core/data/def/BooleanCell.html#get-boolean-
    DataCell[] newCells = { new StringCell(patentId),
        UriCellFactory.create(patentUri),
        new DateAndTimeCell(Integer.parseInt(splitDate[0]),
            Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[2])),
        new StringCell(title), new IntCell(relevanceScore),
        new IntCell(frequency), BooleanCell.BooleanCellFactory.create(inTitle),
        BooleanCell.BooleanCellFactory.create(inAbstract),
        BooleanCell.BooleanCellFactory.create(inDescription),
        BooleanCell.BooleanCellFactory.create(inClaims),
        BooleanCell.BooleanCellFactory.create(inImage),
        BooleanCell.BooleanCellFactory.create(inCwu),};

    // joining the old row with the one created from new information
    return new JoinedRow(new DefaultRow(rowKey, row),
        new DefaultRow(rowKey, newCells));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void reset()
  {
    // TODO: generated method stub
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected DataTableSpec[] configure(final DataTableSpec[] inSpecs)
      throws InvalidSettingsException
  {
    // make it so that the node will be configured if the previous node executes
    // default column "Open Phacts URI"

    if (m_column.getStringValue().equals(""))
    {
      for (DataColumnSpec columnSpec : inSpecs[0])
      {
        String columnName = columnSpec.getName();
        if (columnSpec.getType().isCompatible(URIDataValue.class)
            || columnName.contains("URI")
                && columnSpec.getType().isCompatible(StringValue.class))
        {
          m_column.setStringValue(columnName);
          break;
        }
      }
    }

    if (m_column.getStringValue().equals(
        "")) { throw new InvalidSettingsException("Choose URI Column"); }

    // reading input columns
    DataTableSpec inputTableSpec = inSpecs[0];

    // creating patented outputTable
    DataTableSpec outputTableSpec = new DataTableSpec(inputTableSpec,
        createOutputSpec());

    return new DataTableSpec[] { inputTableSpec, outputTableSpec};
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void saveSettingsTo(final NodeSettingsWO settings)
  {
    // TODO: generated method stub
    m_column.saveSettingsTo(settings);
    m_appId.saveSettingsTo(settings);
    m_appKey.saveSettingsTo(settings);
    m_score_operator.saveSettingsTo(settings);
    m_score.saveSettingsTo(settings);
    m_frequency_operator.saveSettingsTo(settings);
    m_frequency.saveSettingsTo(settings);
    m_classification.saveSettingsTo(settings);
    m_inTitle.saveSettingsTo(settings);
    m_inAbstract.saveSettingsTo(settings);
    m_inDescription.saveSettingsTo(settings);
    m_inClaims.saveSettingsTo(settings);
    m_inImage.saveSettingsTo(settings);
    m_inCwu.saveSettingsTo(settings);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void loadValidatedSettingsFrom(final NodeSettingsRO settings)
      throws InvalidSettingsException
  {
    // TODO: generated method stub
    m_column.loadSettingsFrom(settings);
    m_appId.loadSettingsFrom(settings);
    m_appKey.loadSettingsFrom(settings);
    m_score_operator.loadSettingsFrom(settings);
    m_score.loadSettingsFrom(settings);
    m_frequency_operator.loadSettingsFrom(settings);
    m_frequency.loadSettingsFrom(settings);
    m_classification.loadSettingsFrom(settings);
    m_inTitle.loadSettingsFrom(settings);
    m_inAbstract.loadSettingsFrom(settings);
    m_inDescription.loadSettingsFrom(settings);
    m_inClaims.loadSettingsFrom(settings);
    m_inImage.loadSettingsFrom(settings);
    m_inCwu.loadSettingsFrom(settings);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void validateSettings(final NodeSettingsRO settings)
      throws InvalidSettingsException
  {
    // TODO: generated method stub
    m_column.validateSettings(settings);
    m_appId.validateSettings(settings);
    m_appKey.validateSettings(settings);
    m_score_operator.validateSettings(settings);
    m_score.validateSettings(settings);
    m_frequency_operator.validateSettings(settings);
    m_frequency.validateSettings(settings);
    m_classification.validateSettings(settings);
    m_inTitle.validateSettings(settings);
    m_inAbstract.validateSettings(settings);
    m_inDescription.validateSettings(settings);
    m_inClaims.validateSettings(settings);
    m_inImage.validateSettings(settings);
    m_inCwu.validateSettings(settings);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void loadInternals(final File internDir,
      final ExecutionMonitor exec)
          throws IOException, CanceledExecutionException
  {
    // TODO: generated method stub
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void saveInternals(final File internDir,
      final ExecutionMonitor exec)
          throws IOException, CanceledExecutionException
  {
    // TODO: generated method stub
  }

}
