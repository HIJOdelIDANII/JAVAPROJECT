package thisproject;

import javax.swing.*;

public class Fenetre extends JFrame {
    public Fenetre()
    {
        this.setTitle("Dessin");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,350);
        this.setLocationRelativeTo(null);
        MyComponent my_component= new MyComponent("Red","Rectangle");
        this.setContentPane(my_component);


        this.setVisible(true);
    }
}
