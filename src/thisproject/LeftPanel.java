package thisproject;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    private JLabel label1=new JLabel("Forme:");
    private JLabel label2=new JLabel("Couleur:");
    private JComboBox combo=new JComboBox();
    private JRadioButton bRouge=new JRadioButton ("Rouge");
    private JRadioButton bVert=new JRadioButton("Vert");
    private JRadioButton bBleu=new JRadioButton("Bleu");
    private ButtonGroup groupe=new ButtonGroup();
    private Box vertical_box=Box.createVerticalBox();
    public LeftPanel()
    {
        this.setBackground(Color.cyan);
        bRouge.setBackground(Color.cyan);bVert.setBackground(Color.cyan);bBleu.setBackground(Color.cyan);

        this.setPreferredSize(new Dimension((int)(Fenetre.getWidth_frame()/4),Fenetre.getHeight_frame()));

        combo.addItem("triangle");combo.addItem("rectangle");combo.addItem("ovale");
        groupe.add(bRouge);groupe.add(bVert);groupe.add(bBleu);
        this.add(vertical_box);
        vertical_box.add(label1);vertical_box.add(combo);vertical_box.add(Box.createVerticalStrut(20));
        vertical_box.add(label2);
        vertical_box.add(bRouge);
        vertical_box.add(bVert);
        vertical_box.add(bBleu);//vertical_box.add(Box.createGlue());


    }
}
