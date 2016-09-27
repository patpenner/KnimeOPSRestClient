package node.localPatent;

import org.knime.core.data.DataValue;
import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentColumnNameSelection;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

import node.openPhactsPatent.OpenPhactsPatentNodeModel;

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
public class PatentNodeDialog extends DefaultNodeSettingsPane {

    /**
     * New pane for configuring the Patent node.
     */
    protected PatentNodeDialog() {
      super();
      
      addDialogComponent(
          new DialogComponentColumnNameSelection(
              new SettingsModelString(OpenPhactsPatentNodeModel.CFGKEY_COLUMN_NAME,
                  "Select a column"),
              "Identifier Column", 0, DataValue.class));

    }
}

