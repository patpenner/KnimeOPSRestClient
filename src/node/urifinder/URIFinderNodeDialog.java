package node.urifinder;

import org.knime.core.data.StringValue;
import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentColumnNameSelection;
import org.knime.core.node.defaultnodesettings.DialogComponentString;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

/**
 * <code>NodeDialog</code> for the "URIFinder" Node.
 * 
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more
 * complex dialog please derive directly from
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Patrick Penner
 */
public class URIFinderNodeDialog extends DefaultNodeSettingsPane
{

  /**
   * New pane for configuring the URIFinder node.
   */
  protected URIFinderNodeDialog()
  {
    super();

    addDialogComponent(new DialogComponentString(
        new SettingsModelString(URIFinderNodeModel.CFGKEY_APPID, "861f498d"),
        "Enter an App Id"));

    addDialogComponent(new DialogComponentString(
        new SettingsModelString(URIFinderNodeModel.CFGKEY_APPKEY,
            "a4c4cfeafc60d525dd5b286906e21e06"),
        "Enter an App Key"));

    addDialogComponent(
        new DialogComponentColumnNameSelection(
            new SettingsModelString(URIFinderNodeModel.CFGKEY_COLUMN_NAME,
                "Select a column"),
            "Select an Identifier", 0, StringValue.class));
  }
}
