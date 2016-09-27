package node.patent;

import org.knime.core.data.StringValue;
import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentColumnNameSelection;
import org.knime.core.node.defaultnodesettings.DialogComponentNumber;
import org.knime.core.node.defaultnodesettings.DialogComponentNumberEdit;
import org.knime.core.node.defaultnodesettings.DialogComponentString;
import org.knime.core.node.defaultnodesettings.DialogComponentStringSelection;
import org.knime.core.node.defaultnodesettings.SettingsModelInteger;
import org.knime.core.node.defaultnodesettings.SettingsModelIntegerBounded;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

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
public class PatentNodeDialog extends DefaultNodeSettingsPane
{

  /**
   * New pane for configuring the Patent node.
   */
  protected PatentNodeDialog()
  {
    super();

    // authentification and column selection
    addDialogComponent(new DialogComponentString(
        new SettingsModelString(PatentNodeModel.CFGKEY_APPID, "861f498d"),
        "App ID"));

    addDialogComponent(new DialogComponentString(
        new SettingsModelString(PatentNodeModel.CFGKEY_APPKEY,
            "a4c4cfeafc60d525dd5b286906e21e06"),
        "App Key"));

    addDialogComponent(
        new DialogComponentColumnNameSelection(
            new SettingsModelString(PatentNodeModel.CFGKEY_COLUMN_NAME,
                "Select a column"),
            "Identifier Column", 0, StringValue.class));

    createNewTab("Search Filters");

    // numerical search filters
    // TODO: fix alignment

    setHorizontalPlacement(true);
    String[] operatorList = { ">=", ">", "=", "<", "<="};
    addDialogComponent(new DialogComponentStringSelection(
        new SettingsModelString(PatentNodeModel.CFGKEY_SCORE_OPERATOR, ""),
        "Relevance Score", operatorList));

    addDialogComponent(new DialogComponentNumber(
        new SettingsModelIntegerBounded(PatentNodeModel.CFGKEY_SCORE, 0, 0, 3),
        "", 1));

    addDialogComponent(new DialogComponentStringSelection(
        new SettingsModelString(PatentNodeModel.CFGKEY_FREQUENCY_OPERATOR, ""),
        "Frequency", operatorList));

    addDialogComponent(new DialogComponentNumber(
        new SettingsModelInteger(PatentNodeModel.CFGKEY_FREQUENCY, 0), "", 1));

    setHorizontalPlacement(false);
    // Patent specific search filters
    addDialogComponent(new DialogComponentString(
        new SettingsModelString(PatentNodeModel.CFGKEY_CLASSIFICATION, ""),
        "Patent Classification"));

    String[] booleanNoneList = { " ", "True", "False"};

    addDialogComponent(new DialogComponentStringSelection(
        new SettingsModelString(PatentNodeModel.CFGKEY_IN_TITLE,
            booleanNoneList[0]),
        "Found in Title             ", booleanNoneList));
    addDialogComponent(
        new DialogComponentStringSelection(
            new SettingsModelString(PatentNodeModel.CFGKEY_IN_ABSRACT,
                booleanNoneList[0]),
            "Found in Abstract      ", booleanNoneList));
    addDialogComponent(new DialogComponentStringSelection(
        new SettingsModelString(PatentNodeModel.CFGKEY_IN_DESCRIPTION,
            booleanNoneList[0]),
        "Found in Description", booleanNoneList));
    addDialogComponent(
        new DialogComponentStringSelection(
            new SettingsModelString(PatentNodeModel.CFGKEY_IN_CLAIMS,
                booleanNoneList[0]),
            "Found in Claims         ", booleanNoneList));
    addDialogComponent(
        new DialogComponentStringSelection(
            new SettingsModelString(PatentNodeModel.CFGKEY_IN_IMAGE,
                booleanNoneList[0]),
            "Found in Image          ", booleanNoneList));
    addDialogComponent(
        new DialogComponentStringSelection(
            new SettingsModelString(PatentNodeModel.CFGKEY_IN_CWU,
                booleanNoneList[0]),
            "Found in CWU            ", booleanNoneList));

  }
}
