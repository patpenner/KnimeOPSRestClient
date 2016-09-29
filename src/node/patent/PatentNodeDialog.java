package node.patent;

import org.knime.core.data.DataTableSpec;
import org.knime.core.node.InvalidSettingsException;
import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeSettingsRO;
import org.knime.core.node.NodeSettingsWO;
import org.knime.core.node.NotConfigurableException;
import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;

/**
 * <code>NodeDialog</code> for the "Patent" Node.
 * 
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more
 * complex dialog please derive directly from
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Patrick Penner
 */
public class PatentNodeDialog extends NodeDialogPane
{
  private FilterPanel filterPanel;

  /**
   * New pane for configuring the Patent node.
   */
  protected PatentNodeDialog()
  {
    filterPanel = new FilterPanel();

    addTab("Options", filterPanel);

  }

  @Override
  protected void saveSettingsTo(NodeSettingsWO arg0)
      throws InvalidSettingsException
  {
    // TODO Auto-generated method stub

  }

  @Override
  protected void loadSettingsFrom(final NodeSettingsRO settings,
      final DataTableSpec[] specs) throws NotConfigurableException
  {}
}
