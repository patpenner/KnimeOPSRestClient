package node.patentsplitter;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "PatentSplitter" Node.
 * 
 *
 * @author Patrick Penner
 */
public class PatentSplitterNodeFactory
    extends
    NodeFactory<PatentSplitterNodeModel>
{

  /**
   * {@inheritDoc}
   */
  @Override
  public PatentSplitterNodeModel createNodeModel()
  {
    return new PatentSplitterNodeModel();
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
  public NodeView<PatentSplitterNodeModel> createNodeView(final int viewIndex,
      final PatentSplitterNodeModel nodeModel)
  {
    return new PatentSplitterNodeView(nodeModel);
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
    return new PatentSplitterNodeDialog();
  }

}
