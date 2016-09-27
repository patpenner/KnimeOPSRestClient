package node.localPatent;

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
import org.knime.core.data.date.DateAndTimeCell;
import org.knime.core.data.def.BooleanCell;
import org.knime.core.data.def.LongCell;
import org.knime.core.data.def.StringCell;
import org.knime.core.node.BufferedDataTable;
import org.knime.core.node.CanceledExecutionException;
import org.knime.core.node.ExecutionContext;
import org.knime.core.node.ExecutionMonitor;
import org.knime.core.node.InvalidSettingsException;
import org.knime.core.node.NodeModel;
import org.knime.core.node.NodeSettingsRO;
import org.knime.core.node.NodeSettingsWO;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

import node.urifinder.URIFinderNodeModel;

/**
 * This is the model implementation of Patent.
 * 
 *
 * @author Patrick Penner
 */
public class PatentNodeModel extends NodeModel
{

  private static final int IN_PORT_IDENTIFIER = 0;
  public static final String CFGKEY_COLUMN_NAME = "columnName";

  private final SettingsModelString m_column = new SettingsModelString(
      URIFinderNodeModel.CFGKEY_COLUMN_NAME, "");

  /**
   * Constructor for the node model.
   */
  protected PatentNodeModel()
  {
    // in 0: Identifier
    // out 0: Not Patented Rows
    // out 1: Patented Rows
    super(1, 2);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected BufferedDataTable[] execute(final BufferedDataTable[] inData,
      final ExecutionContext exec) throws Exception
  {
    DataTableSpec inputTableSpec = inData[IN_PORT_IDENTIFIER]
        .getDataTableSpec();
    // creating patentedTableSpec
    DataTableSpec patentedTableSpec = new DataTableSpec(inputTableSpec,
        createPatentedSpec());
    // creating notPatentedTableSpec
    DataTableSpec notPatentedTableSpec = new DataTableSpec(inputTableSpec,
        createNotPatentedSpec());

    // creating containers
    DataContainer patentedContainer = exec
        .createDataContainer(patentedTableSpec);
    DataContainer notPatentedContainer = exec
        .createDataContainer(notPatentedTableSpec);

    // getting the column index for the identifier
    int columnIndex = inputTableSpec.findColumnIndex(m_column.getStringValue());
    String identifierType = null;

    long rowCount = inData[0].size();
    long currentRow = 0;

    long noPatentRowIndex = 0;
    long patentRowIndex = 0;

    for (DataRow row : inData[IN_PORT_IDENTIFIER])
    {
      // extracting identifier from cell
      String identifier = ((StringValue) row.getCell(columnIndex))
          .getStringValue();

      // determining identifier once
      if (identifierType == null)
      {
        identifierType = checkIdentifierType(identifier);
      }
      
      /*
       * TODO: Insert Functionality here
       */

      currentRow++;

      // setting progress bar and message
      exec.setProgress((double) currentRow / rowCount,
          "Processing row " + (currentRow + 1));
    }

    // making BufferedDataTables
    patentedContainer.close();
    BufferedDataTable patented = exec
        .createBufferedDataTable(patentedContainer.getTable(), exec);

    notPatentedContainer.close();
    BufferedDataTable notPatented = exec
        .createBufferedDataTable(notPatentedContainer.getTable(), exec);

    // TODO: Return a BufferedDataTable for each output port
    return new BufferedDataTable[] { notPatented, patented};
  }

  private String checkIdentifierType(String identifier)
      throws InvalidSettingsException
  {
    // mainly catches SDF format
    if (identifier.contains("\n")) { throw new InvalidSettingsException(
        "Identifier not a Smiles, InChI or InChI Key"); }

    // rudimentary separation of the three accepted identifiers
    if (identifier.contains("InChI"))
    {
      return "InChI";
    }
    else if (identifier.contains("=") || identifier.contains("(")
        || identifier.contains("c")) { return "Smiles"; }
    return "InChI Key";
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

    // looks for a smiles value first, then looks for inchi or inchi key
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

    // if no identifier is quickly found exception is thrown
    if (m_column.getStringValue().equals(
        "")) { throw new InvalidSettingsException("Choose URI Column"); }

    DataTableSpec inputTableSpec = inSpecs[0];
    // creating patentedTableSpec
    DataTableSpec patentedTableSpec = new DataTableSpec(inputTableSpec,
        createPatentedSpec());
    // creating notPatentedTableSpec
    DataTableSpec notPatentedTableSpec = new DataTableSpec(inputTableSpec,
        createNotPatentedSpec());

    // TODO: generated method stub
    return new DataTableSpec[] { patentedTableSpec, notPatentedTableSpec};
  }

  private DataTableSpec createPatentedSpec()
  {
    DataColumnSpec[] newColumns = {
        new DataColumnSpecCreator("Patent ID", StringCell.TYPE).createSpec(),
        new DataColumnSpecCreator("Date Published", DateAndTimeCell.TYPE)
            .createSpec(),
        new DataColumnSpecCreator("Title", StringCell.TYPE).createSpec(),
        new DataColumnSpecCreator("Occ. Title", LongCell.TYPE).createSpec(),
        new DataColumnSpecCreator("Occ. Abstract", LongCell.TYPE).createSpec(),
        new DataColumnSpecCreator("Occ. Description", LongCell.TYPE)
            .createSpec(),
        new DataColumnSpecCreator("Occ. Claims", LongCell.TYPE).createSpec(),
        new DataColumnSpecCreator("Occ. Image", LongCell.TYPE).createSpec(),
        new DataColumnSpecCreator("Occ. CWU", LongCell.TYPE).createSpec(),};
    return new DataTableSpec(newColumns);
  }

  private DataTableSpec createNotPatentedSpec()
  {
    // TODO Auto-generated method stub
    return new DataTableSpec(
        new DataColumnSpecCreator("Patent Information", StringCell.TYPE)
            .createSpec());
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void saveSettingsTo(final NodeSettingsWO settings)
  {
    // TODO: generated method stub
    m_column.saveSettingsTo(settings);
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
