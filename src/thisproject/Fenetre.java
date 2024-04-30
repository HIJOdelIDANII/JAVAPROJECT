package thisproject;

import javax.swing.*;

public class Fenetre extends JFrame {
    public static int width;
    public static int  height;
    public Fenetre(int width,int height )
    {   this.width=width;this.height=height;
        this.setTitle("Dessin");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
        MainPanel MyMainPanel= new MainPanel();
        this.setContentPane(MyMainPanel);


        this.setVisible(true);
    }
    public static int getWidth_frame() {
        return width;
    }
    public static int getHeight_frame() {
        return height;
    }
}
