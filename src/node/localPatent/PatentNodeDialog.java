package node.localPatent;

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
public class PatentNodeDialog extends DefaultNodeSettingsPane {

    /**
     * New pane for configuring the Patent node.
     */
    protected PatentNodeDialog() {

    }
}

