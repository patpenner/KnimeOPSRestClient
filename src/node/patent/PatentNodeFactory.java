package node.patent;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Patent" Node.
 * 
 *
 * @author Patrick Penner
 */
public class PatentNodeFactory extends NodeFactory<PatentNodeModel>
{

  /**
   * {@inheritDoc}
   */
  @Override
  public PatentNodeModel createNodeModel()
  {
    return new PatentNodeModel();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getNrNodeViews()
  {
    return 1;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public NodeView<PatentNodeModel> createNodeView(final int viewIndex,
      final PatentNodeModel nodeModel)
  {
    return new PatentNodeView(nodeModel);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean hasDialog()
  {
    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public NodeDialogPane createNodeDialogPane()
  {
    return new PatentNodeDialog();
  }

}
