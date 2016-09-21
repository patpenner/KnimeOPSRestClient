package node.urifinder;

import java.io.File;
import java.io.IOException;

import org.knime.chem.types.InchiValue;
import org.knime.chem.types.SmilesValue;
import org.knime.core.data.DataColumnSpec;
import org.knime.core.data.DataColumnSpecCreator;
import org.knime.core.data.DataRow;
import org.knime.core.data.DataTableSpec;
import org.knime.core.data.StringValue;
import org.knime.core.data.container.DataContainer;
import org.knime.core.data.def.DefaultRow;
import org.knime.core.data.def.JoinedRow;
import org.knime.core.data.uri.URIDataCell;
import org.knime.core.data.uri.UriCellFactory;
import org.knime.core.node.BufferedDataTable;
import org.knime.core.node.CanceledExecutionException;
import org.knime.core.node.ExecutionContext;
import org.knime.core.node.ExecutionMonitor;
import org.knime.core.node.InvalidSettingsException;
import org.knime.core.node.NodeModel;
import org.knime.core.node.NodeSettingsRO;
import org.knime.core.node.NodeSettingsWO;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ChemicalStructureSearchApi;
import structure.structureExact.model.StructureExact;
import structure.structureInformation.model.StructureInformation;

/**
 * This is the model implementation of URIFinder.
 * 
 *
 * @author Patrick Penner
 */
public class URIFinderNodeModel extends NodeModel
{

  public static final String CFGKEY_COLUMN_NAME = "columnName";
  public static final String CFGKEY_APPID = "appId";
  public static final String CFGKEY_APPKEY = "appKey";

  private final SettingsModelString m_column = new SettingsModelString(
      URIFinderNodeModel.CFGKEY_COLUMN_NAME, "");
  private final SettingsModelString m_appId = new SettingsModelString(
      URIFinderNodeModel.CFGKEY_APPID, "861f498d");
  private final SettingsModelString m_appKey = new SettingsModelString(
      URIFinderNodeModel.CFGKEY_APPKEY, "a4c4cfeafc60d525dd5b286906e21e06");

  // Identifier Type can be: SMILES, InChI, InChI Key
  private String identifierType = null;

  /**
   * Constructor for the node model.
   */
  protected URIFinderNodeModel()
  {
    // in 0: table with at identifier
    // out 0: table with Open Phacts URI
    // out 1: table with not found rows
    super(1, 2);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected BufferedDataTable[] execute(final BufferedDataTable[] inData,
      final ExecutionContext exec) throws Exception
  {
    // getting inputTableSpec
    DataTableSpec inputTableSpec = inData[0].getDataTableSpec();
    // creating uriTableSpec by adding URI column
    DataTableSpec uriTableSpec = new DataTableSpec(inputTableSpec,
        createOutputSpec());

    // creating containers
    DataContainer container = exec.createDataContainer(uriTableSpec);
    DataContainer notFoundContainer = exec.createDataContainer(inputTableSpec);

    // creating API components to pass to main row processing
    ApiClient apiClient = new ApiClient();
    // TODO: version independent path
    apiClient.setBasePath("https://beta.openphacts.org/2.1");

    ChemicalStructureSearchApi structureApi = new ChemicalStructureSearchApi(
        apiClient);

    int colIndex = inputTableSpec.findColumnIndex(m_column.getStringValue());
    // rowCount for inputTable
    long rowCount = inData[0].size();
    long currentRow = 0;

    for (DataRow row : inData[0])
    {
      // extracting identifier from cell
      String identifier = ((StringValue) row.getCell(colIndex))
          .getStringValue();

      // determining identifier once
      if (identifierType == null)
      {
        identifierType = checkIdentifierType(identifier);
      }

      // actual API call, returns null if something went wrong (Not Found /
      // Exception)
      String uri = getURI(identifier, structureApi);
      if (uri != null)
      {
        container.addRowToTable(new JoinedRow(row,
            new DefaultRow(row.getKey(), UriCellFactory.create(uri))));
      }
      else
      {
        notFoundContainer.addRowToTable(row);
      }

      // set progress bar and message
      currentRow++;
      exec.setProgress((double) currentRow / rowCount,
          " processing row " + (currentRow + 1));

    }
    container.close();
    notFoundContainer.close();

    // creating outputTable 0
    BufferedDataTable outputTableFound = exec
        .createBufferedDataTable(container.getTable(), exec);
    // creating outpuTable 1
    BufferedDataTable outputTableNotFound = exec
        .createBufferedDataTable(notFoundContainer.getTable(), exec);

    return new BufferedDataTable[] { outputTableFound, outputTableNotFound};
  }

  private DataTableSpec createOutputSpec()
  {
    return new DataTableSpec(
        new DataColumnSpecCreator("Open Phacts URI", URIDataCell.TYPE)
            .createSpec());
  }

  private String checkIdentifierType(String identifier)
      throws InvalidSettingsException
  {
    // mainly catches SDF format
    if (identifier.contains("\n")) { throw new InvalidSettingsException(
        "Identifier not a SMILES, InChI or InChI Key"); }

    // rudimentary separation of the three accepted identifiers
    if (identifier.contains("InChI"))
    {
      return "InChI";
    }
    else if (identifier.contains("=") || identifier.contains("(")
        || identifier.contains("c")) { return "SMILES"; }
    return "InChI Key";
  }

  private String getURI(String identifier,
      ChemicalStructureSearchApi structureApi)
  {
    // makes the apropriat API call
    // returns null on API failure

    String uri = null;
    // Method defines identifier type by position of argument
    try
    {
      if (identifierType.equals("SMILES"))
      {
        // structure/exact call finds more URIs than conventional structure
        // call, only applicable to smiles
        StructureExact structureResponse = structureApi.structureExactGet(
            m_appId.getStringValue(), m_appKey.getStringValue(), identifier, 0,
            null, null, null);
        uri = structureResponse.getResult().getPrimaryTopic().getResult();
      }
      else if (identifierType.equals("InChI"))
      {
        StructureInformation structureResponse = structureApi.structureGet(
            m_appId.getStringValue(), m_appKey.getStringValue(), identifier,
            null, null, null, null, null);
        uri = structureResponse.getResult().getPrimaryTopic().getAbout();
      }
      else if (identifierType.equals("InChI Key"))
      {
        StructureInformation structureResponse = structureApi.structureGet(
            m_appId.getStringValue(), m_appKey.getStringValue(), null,
            identifier, null, null, null, null);
        uri = structureResponse.getResult().getPrimaryTopic().getAbout();
      }
    }
    catch (ApiException apiE)
    {
      // recieves internal server errors on not found uris
      // TODO: handle exception
    }

    return uri;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void reset()
  {
    identifierType = null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected DataTableSpec[] configure(final DataTableSpec[] inSpecs)
      throws InvalidSettingsException
  {

    if (m_column.getStringValue().equals(""))
    {
      for (DataColumnSpec columnSpec : inSpecs[0])
      {
        String columnName = columnSpec.getName();
        if (columnSpec.getType().isCompatible(SmilesValue.class)
            || (columnName.contains("Smiles")
                && columnSpec.getType().isCompatible(StringValue.class)))
        {
          m_column.setStringValue(columnName);
          break;
        }
      }
    }

    if (m_column.getStringValue().equals(""))
    {
      for (DataColumnSpec columnSpec : inSpecs[0])
      {
        String columnName = columnSpec.getName();
        if (columnSpec.getType().isCompatible(InchiValue.class)
            || (columnName.contains("InChI")
                && columnSpec.getType().isCompatible(StringValue.class)))
          ;
        {
          m_column.setStringValue(columnName);
          break;
        }
      }
    }

    if (m_column.getStringValue().equals(
        "")) { throw new InvalidSettingsException("Choose URI Column"); }

    DataTableSpec inputTableSpec = inSpecs[0];
    // creating uriTableSpec by adding URI column
    DataTableSpec uriTableSpec = new DataTableSpec(inputTableSpec,
        createOutputSpec());

    // TODO: generated method stub
    return new DataTableSpec[] { uriTableSpec, inputTableSpec};
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
