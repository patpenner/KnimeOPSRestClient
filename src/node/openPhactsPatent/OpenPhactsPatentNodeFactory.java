package node.openPhactsPatent;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Patent" Node.
 * 
 *
 * @author Patrick Penner
 */
public class OpenPhactsPatentNodeFactory 
        extends NodeFactory<OpenPhactsPatentNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenPhactsPatentNodeModel createNodeModel() {
        return new OpenPhactsPatentNodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<OpenPhactsPatentNodeModel> createNodeView(final int viewIndex,
            final OpenPhactsPatentNodeModel nodeModel) {
        return new OpenPhactsPatentNodeView(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new OpenPhactsPatentNodeDialog();
    }

}

