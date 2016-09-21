package node.urifinder;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "URIFinder" Node.
 * 
 *
 * @author Patrick Penner
 */
public class URIFinderNodeFactory extends NodeFactory<URIFinderNodeModel>
{

  /**
   * {@inheritDoc}
   */
  @Override
  public URIFinderNodeModel createNodeModel()
  {
    return new URIFinderNodeModel();
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
  public NodeView<URIFinderNodeModel> createNodeView(final int viewIndex,
      final URIFinderNodeModel nodeModel)
  {
    return new URIFinderNodeView(nodeModel);
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
    return new URIFinderNodeDialog();
  }

}
