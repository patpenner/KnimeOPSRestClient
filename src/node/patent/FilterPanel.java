package node.patent;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

public class FilterPanel extends JPanel
{
  public FilterPanel()
  {
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 0};
    gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0};
    gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE};
    gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE};
    setLayout(gridBagLayout);

    panel_4 = new JPanel();
    panel_4.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)),
        "Identifier", TitledBorder.LEADING, TitledBorder.TOP, null,
        new Color(51, 51, 51)));
    GridBagConstraints gbc_panel_4 = new GridBagConstraints();
    gbc_panel_4.insets = new Insets(0, 0, 5, 0);
    gbc_panel_4.fill = GridBagConstraints.BOTH;
    gbc_panel_4.gridx = 0;
    gbc_panel_4.gridy = 0;
    add(panel_4, gbc_panel_4);
    GridBagLayout gbl_panel_4 = new GridBagLayout();
    gbl_panel_4.columnWidths = new int[] { 0, 0, 0, 0, 0};
    gbl_panel_4.rowHeights = new int[] { 0, 0};
    gbl_panel_4.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0,
        Double.MIN_VALUE};
    gbl_panel_4.rowWeights = new double[] { 1.0, Double.MIN_VALUE};
    panel_4.setLayout(gbl_panel_4);

    lblColumn = new JLabel("Structural Identifier");
    GridBagConstraints gbc_lblColumn = new GridBagConstraints();
    gbc_lblColumn.insets = new Insets(0, 0, 0, 5);
    gbc_lblColumn.anchor = GridBagConstraints.EAST;
    gbc_lblColumn.gridx = 1;
    gbc_lblColumn.gridy = 0;
    panel_4.add(lblColumn, gbc_lblColumn);

    columnName = new JComboBox();
    columnName.setModel(new DefaultComboBoxModel(
        new String[] { "Smiles", "InChI", "InChI Key"}));
    GridBagConstraints gbc_columnName = new GridBagConstraints();
    gbc_columnName.insets = new Insets(0, 0, 0, 5);
    gbc_columnName.fill = GridBagConstraints.HORIZONTAL;
    gbc_columnName.gridx = 2;
    gbc_columnName.gridy = 0;
    panel_4.add(columnName, gbc_columnName);

    JPanel panel_2 = new JPanel();
    panel_2.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)),
        "Fields", TitledBorder.LEADING, TitledBorder.TOP, null,
        new Color(51, 51, 51)));
    GridBagConstraints gbc_panel_2 = new GridBagConstraints();
    gbc_panel_2.fill = GridBagConstraints.BOTH;
    gbc_panel_2.insets = new Insets(0, 0, 5, 0);
    gbc_panel_2.gridx = 0;
    gbc_panel_2.gridy = 1;
    add(panel_2, gbc_panel_2);
    GridBagLayout gbl_panel_2 = new GridBagLayout();
    gbl_panel_2.columnWidths = new int[] { 0, 0};
    gbl_panel_2.rowHeights = new int[] { 173, 0};
    gbl_panel_2.columnWeights = new double[] { 1.0, Double.MIN_VALUE};
    gbl_panel_2.rowWeights = new double[] { 1.0, Double.MIN_VALUE};
    panel_2.setLayout(gbl_panel_2);

    JPanel panel = new JPanel();
    GridBagConstraints gbc_panel = new GridBagConstraints();
    gbc_panel.fill = GridBagConstraints.BOTH;
    gbc_panel.gridx = 0;
    gbc_panel.gridy = 0;
    panel_2.add(panel, gbc_panel);
    GridBagLayout gbl_panel = new GridBagLayout();
    gbl_panel.columnWidths = new int[] { 0, 0, 60, 0, 0, 0};
    gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 12, 0};
    gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0,
        Double.MIN_VALUE};
    gbl_panel.rowWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
        0.0, Double.MIN_VALUE};
    panel.setLayout(gbl_panel);

    JLabel lblOccursInTitle = new JLabel("Occurrences in Title");
    GridBagConstraints gbc_lblOccursInTitle = new GridBagConstraints();
    gbc_lblOccursInTitle.anchor = GridBagConstraints.WEST;
    gbc_lblOccursInTitle.insets = new Insets(0, 0, 5, 5);
    gbc_lblOccursInTitle.gridx = 1;
    gbc_lblOccursInTitle.gridy = 1;
    panel.add(lblOccursInTitle, gbc_lblOccursInTitle);

    operatorTitle = new JComboBox();
    operatorTitle.setModel(operatorComboBoxModel);
    operatorTitle.setSelectedIndex(1);
    GridBagConstraints gbc_operatorTitle = new GridBagConstraints();
    gbc_operatorTitle.insets = new Insets(0, 0, 5, 5);
    gbc_operatorTitle.fill = GridBagConstraints.HORIZONTAL;
    gbc_operatorTitle.gridx = 2;
    gbc_operatorTitle.gridy = 1;
    panel.add(operatorTitle, gbc_operatorTitle);

    frequencyTitle = new JTextField();
    frequencyTitle.setText("0");
    GridBagConstraints gbc_frequencyTitle = new GridBagConstraints();
    gbc_frequencyTitle.insets = new Insets(0, 0, 5, 5);
    gbc_frequencyTitle.fill = GridBagConstraints.HORIZONTAL;
    gbc_frequencyTitle.gridx = 3;
    gbc_frequencyTitle.gridy = 1;
    panel.add(frequencyTitle, gbc_frequencyTitle);
    frequencyTitle.setColumns(10);

    JLabel lblOccursInAbstract = new JLabel("Occurrences in Abstract");
    GridBagConstraints gbc_lblOccursInAbstract = new GridBagConstraints();
    gbc_lblOccursInAbstract.anchor = GridBagConstraints.WEST;
    gbc_lblOccursInAbstract.insets = new Insets(0, 0, 5, 5);
    gbc_lblOccursInAbstract.gridx = 1;
    gbc_lblOccursInAbstract.gridy = 2;
    panel.add(lblOccursInAbstract, gbc_lblOccursInAbstract);

    operatorAbstract = new JComboBox();
    operatorAbstract.setModel(operatorComboBoxModel);
    operatorAbstract.setSelectedIndex(1);
    GridBagConstraints gbc_operatorAbstract = new GridBagConstraints();
    gbc_operatorAbstract.insets = new Insets(0, 0, 5, 5);
    gbc_operatorAbstract.fill = GridBagConstraints.HORIZONTAL;
    gbc_operatorAbstract.gridx = 2;
    gbc_operatorAbstract.gridy = 2;
    panel.add(operatorAbstract, gbc_operatorAbstract);

    frequencyAbstract = new JTextField();
    frequencyAbstract.setText("0");
    GridBagConstraints gbc_frequencyAbstract = new GridBagConstraints();
    gbc_frequencyAbstract.insets = new Insets(0, 0, 5, 5);
    gbc_frequencyAbstract.fill = GridBagConstraints.HORIZONTAL;
    gbc_frequencyAbstract.gridx = 3;
    gbc_frequencyAbstract.gridy = 2;
    panel.add(frequencyAbstract, gbc_frequencyAbstract);
    frequencyAbstract.setColumns(10);

    JLabel lblOccursInDescription = new JLabel("Occurrences in Description");
    GridBagConstraints gbc_lblOccursInDescription = new GridBagConstraints();
    gbc_lblOccursInDescription.anchor = GridBagConstraints.WEST;
    gbc_lblOccursInDescription.insets = new Insets(0, 0, 5, 5);
    gbc_lblOccursInDescription.gridx = 1;
    gbc_lblOccursInDescription.gridy = 3;
    panel.add(lblOccursInDescription, gbc_lblOccursInDescription);

    operatorDescription = new JComboBox();
    operatorDescription.setModel(operatorComboBoxModel);
    operatorDescription.setSelectedIndex(1);
    GridBagConstraints gbc_operatorDescription = new GridBagConstraints();
    gbc_operatorDescription.insets = new Insets(0, 0, 5, 5);
    gbc_operatorDescription.fill = GridBagConstraints.HORIZONTAL;
    gbc_operatorDescription.gridx = 2;
    gbc_operatorDescription.gridy = 3;
    panel.add(operatorDescription, gbc_operatorDescription);

    frequencyDescription = new JTextField();
    frequencyDescription.setText("0");
    GridBagConstraints gbc_frequencyDescription = new GridBagConstraints();
    gbc_frequencyDescription.insets = new Insets(0, 0, 5, 5);
    gbc_frequencyDescription.fill = GridBagConstraints.HORIZONTAL;
    gbc_frequencyDescription.gridx = 3;
    gbc_frequencyDescription.gridy = 3;
    panel.add(frequencyDescription, gbc_frequencyDescription);
    frequencyDescription.setColumns(10);

    JLabel lblOccursInClaims = new JLabel("Occurrences in Claims");
    GridBagConstraints gbc_lblOccursInClaims = new GridBagConstraints();
    gbc_lblOccursInClaims.anchor = GridBagConstraints.WEST;
    gbc_lblOccursInClaims.insets = new Insets(0, 0, 5, 5);
    gbc_lblOccursInClaims.gridx = 1;
    gbc_lblOccursInClaims.gridy = 4;
    panel.add(lblOccursInClaims, gbc_lblOccursInClaims);

    operatorClaims = new JComboBox();
    operatorClaims.setModel(operatorComboBoxModel);
    operatorClaims.setSelectedIndex(1);
    GridBagConstraints gbc_operatorClaims = new GridBagConstraints();
    gbc_operatorClaims.insets = new Insets(0, 0, 5, 5);
    gbc_operatorClaims.fill = GridBagConstraints.HORIZONTAL;
    gbc_operatorClaims.gridx = 2;
    gbc_operatorClaims.gridy = 4;
    panel.add(operatorClaims, gbc_operatorClaims);

    frequencyClaims = new JTextField();
    frequencyClaims.setText("0");
    GridBagConstraints gbc_frequencyClaims = new GridBagConstraints();
    gbc_frequencyClaims.insets = new Insets(0, 0, 5, 5);
    gbc_frequencyClaims.fill = GridBagConstraints.HORIZONTAL;
    gbc_frequencyClaims.gridx = 3;
    gbc_frequencyClaims.gridy = 4;
    panel.add(frequencyClaims, gbc_frequencyClaims);
    frequencyClaims.setColumns(10);

    JLabel lblOccursInImages = new JLabel("Occurrences in Images");
    GridBagConstraints gbc_lblOccursInImages = new GridBagConstraints();
    gbc_lblOccursInImages.anchor = GridBagConstraints.WEST;
    gbc_lblOccursInImages.insets = new Insets(0, 0, 5, 5);
    gbc_lblOccursInImages.gridx = 1;
    gbc_lblOccursInImages.gridy = 5;
    panel.add(lblOccursInImages, gbc_lblOccursInImages);

    operatorImages = new JComboBox();
    operatorImages.setModel(operatorComboBoxModel);
    operatorImages.setSelectedIndex(1);
    GridBagConstraints gbc_operatorImages = new GridBagConstraints();
    gbc_operatorImages.insets = new Insets(0, 0, 5, 5);
    gbc_operatorImages.fill = GridBagConstraints.HORIZONTAL;
    gbc_operatorImages.gridx = 2;
    gbc_operatorImages.gridy = 5;
    panel.add(operatorImages, gbc_operatorImages);

    frequencyImages = new JTextField();
    frequencyImages.setText("0");
    GridBagConstraints gbc_frequencyImages = new GridBagConstraints();
    gbc_frequencyImages.insets = new Insets(0, 0, 5, 5);
    gbc_frequencyImages.fill = GridBagConstraints.HORIZONTAL;
    gbc_frequencyImages.gridx = 3;
    gbc_frequencyImages.gridy = 5;
    panel.add(frequencyImages, gbc_frequencyImages);
    frequencyImages.setColumns(10);

    JLabel lblOccursInAttachements = new JLabel("Occurrences in Attachements");
    GridBagConstraints gbc_lblOccursInAttachements = new GridBagConstraints();
    gbc_lblOccursInAttachements.anchor = GridBagConstraints.WEST;
    gbc_lblOccursInAttachements.insets = new Insets(0, 0, 5, 5);
    gbc_lblOccursInAttachements.gridx = 1;
    gbc_lblOccursInAttachements.gridy = 6;
    panel.add(lblOccursInAttachements, gbc_lblOccursInAttachements);

    operatorAttachements = new JComboBox();
    operatorAttachements.setModel(operatorComboBoxModel);
    operatorAttachements.setSelectedIndex(1);
    GridBagConstraints gbc_operatorAttachements = new GridBagConstraints();
    gbc_operatorAttachements.insets = new Insets(0, 0, 5, 5);
    gbc_operatorAttachements.fill = GridBagConstraints.HORIZONTAL;
    gbc_operatorAttachements.gridx = 2;
    gbc_operatorAttachements.gridy = 6;
    panel.add(operatorAttachements, gbc_operatorAttachements);

    frequencyAttachements = new JTextField();
    frequencyAttachements.setText("0");
    GridBagConstraints gbc_frequencyAttachements = new GridBagConstraints();
    gbc_frequencyAttachements.insets = new Insets(0, 0, 5, 5);
    gbc_frequencyAttachements.fill = GridBagConstraints.HORIZONTAL;
    gbc_frequencyAttachements.gridx = 3;
    gbc_frequencyAttachements.gridy = 6;
    panel.add(frequencyAttachements, gbc_frequencyAttachements);
    frequencyAttachements.setColumns(10);

    JPanel panel_3 = new JPanel();
    panel_3.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)),
        "Classification", TitledBorder.LEADING, TitledBorder.TOP, null,
        new Color(51, 51, 51)));
    GridBagConstraints gbc_panel_3 = new GridBagConstraints();
    gbc_panel_3.fill = GridBagConstraints.BOTH;
    gbc_panel_3.gridx = 0;
    gbc_panel_3.gridy = 2;
    add(panel_3, gbc_panel_3);
    GridBagLayout gbl_panel_3 = new GridBagLayout();
    gbl_panel_3.columnWidths = new int[] { 0, 0};
    gbl_panel_3.rowHeights = new int[] { 0, 0};
    gbl_panel_3.columnWeights = new double[] { 1.0, Double.MIN_VALUE};
    gbl_panel_3.rowWeights = new double[] { 1.0, Double.MIN_VALUE};
    panel_3.setLayout(gbl_panel_3);

    JPanel panel_1 = new JPanel();
    GridBagConstraints gbc_panel_1 = new GridBagConstraints();
    gbc_panel_1.fill = GridBagConstraints.BOTH;
    gbc_panel_1.gridx = 0;
    gbc_panel_1.gridy = 0;
    panel_3.add(panel_1, gbc_panel_1);
    GridBagLayout gbl_panel_1 = new GridBagLayout();
    gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0};
    gbl_panel_1.rowHeights = new int[] { 0, 0};
    gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0,
        Double.MIN_VALUE};
    gbl_panel_1.rowWeights = new double[] { 1.0, Double.MIN_VALUE};
    panel_1.setLayout(gbl_panel_1);

    JLabel lblPatentClassification = new JLabel("Patent Classification");
    GridBagConstraints gbc_lblPatentClassification = new GridBagConstraints();
    gbc_lblPatentClassification.insets = new Insets(0, 0, 0, 5);
    gbc_lblPatentClassification.anchor = GridBagConstraints.EAST;
    gbc_lblPatentClassification.gridx = 1;
    gbc_lblPatentClassification.gridy = 0;
    panel_1.add(lblPatentClassification, gbc_lblPatentClassification);

    classification = new JTextField();
    GridBagConstraints gbc_classification = new GridBagConstraints();
    gbc_classification.insets = new Insets(0, 0, 0, 5);
    gbc_classification.fill = GridBagConstraints.HORIZONTAL;
    gbc_classification.gridx = 2;
    gbc_classification.gridy = 0;
    panel_1.add(classification, gbc_classification);
    classification.setColumns(10);

  }
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private JTextField classification;
  private JTextField frequencyTitle;
  private JTextField frequencyAbstract;
  private JTextField frequencyDescription;
  private JTextField frequencyClaims;
  private JTextField frequencyImages;
  private JTextField frequencyAttachements;
  private JComboBox operatorTitle;
  private JComboBox operatorAbstract;
  private JComboBox operatorDescription;
  private JComboBox operatorClaims;
  private JComboBox operatorImages;
  private JComboBox operatorAttachements;
  private DefaultComboBoxModel<String> operatorComboBoxModel = new DefaultComboBoxModel<String>(
      new String[] { ">", ">=", "=", "<=", "<"});
  private JPanel panel_4;
  private JLabel lblColumn;
  private JComboBox columnName;
}
