package thisproject;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private Box box_horizontal;
    private LeftPanel left_panel;
    public MainPanel(){
        this.setLayout(new BorderLayout());
        MyComponent my_component= new MyComponent("vert","triangle");
        left_panel=new LeftPanel();
        box_horizontal= Box.createHorizontalBox();
        this.add(box_horizontal);
        box_horizontal.add(left_panel);

        box_horizontal.add(my_component);


    }
}
