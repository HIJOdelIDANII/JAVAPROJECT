package thisproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.util.Objects;

public class MainPanel extends JPanel {

    private String Shape;
    private String Color;
    private final Box box_horizontal;
    private LeftPanel left_panel;
    private MyComponent PaintingPanel;

    public void setShape(String shape) {
        this.Shape = shape;
        System.out.println(shape);
        this.update(MainPanel.this.Color, MainPanel.this.Shape);
    }

    public void setColor(String color) {
        System.out.println(color);
        this.Color = color;
       this.update(MainPanel.this.Color, MainPanel.this.Shape);
    }

    public void update(String color, String shape){
        System.out.println("Color: " + color + ", Shape: " + shape);
        this.PaintingPanel.setColor(color); // Update the color
        this.PaintingPanel.setShape(shape); // Update the shape

        // Repaint the panel
        PaintingPanel.repaint();

        System.out.println("updated");
    }


    public MainPanel(){
        this.setLayout(new BorderLayout());
        left_panel = new LeftPanel();
        box_horizontal = Box.createHorizontalBox();
        this.add(box_horizontal);
        box_horizontal.add(left_panel);

        left_panel.getCombo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String shape = Objects.requireNonNull(left_panel.getCombo().getSelectedItem()).toString();
                MainPanel.this.setShape(shape);
            }
        });
        left_panel.getbBleu().addActionListener(new ColorListener());
        left_panel.getbVert().addActionListener(new ColorListener());
        left_panel.getbRouge().addActionListener(new ColorListener());

        this.Shape=left_panel.getCombo().getSelectedItem().toString();
        this.Color="vert";
        PaintingPanel = new MyComponent(this.Color,this.Shape );

        // Update with default color and shape
        //this.update("vert", left_panel.getCombo().getSelectedItem().toString());

        // Add the default PaintingPanel to box_horizontal
        box_horizontal.add(PaintingPanel);
    }



    public class ColorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == left_panel.getbRouge()) {
                MainPanel.this.setColor("rouge");
            }
            else if(e.getSource() == left_panel.getbVert()) {
                MainPanel.this.setColor("vert");
            }
            else if(e.getSource() == left_panel.getbBleu()) {
                MainPanel.this.setColor("bleu");
            }
        }
    }

}
