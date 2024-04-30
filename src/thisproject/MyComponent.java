package thisproject;

import javax.swing.*;
import java.awt.*;

public class MyComponent extends JPanel {
    protected int Y1,Y2,Y3,X_left,X_center,X_right;//those are used for triangle points using fillPolygon
    protected int[] x;
    protected int[] y ;
    protected int width;
    protected int height;
    protected Color color=null;
    protected String shape=null;
    public MyComponent(String color,String shape)
    {
        this.width=(int)(3*((Fenetre.getWidth_frame())/4));this.height=Fenetre.getHeight_frame();
        this.setPreferredSize(new Dimension(this.width,this.height));

        /* i did this for perfect centering and to make the triangle equilateral*/
        X_center=(int)((width/2)+Fenetre.getWidth_frame()/4);
        X_left=X_center-50;X_right=X_center+50;
        Y1=(int)(height/2 +((Math.sqrt(3))*((X_right-X_left)/2))/2);
        System.out.println(Y1);
        System.out.println(height/2);

        Y3=Y1;
        Y2=(int)(Y1-(Math.sqrt(3))*((X_right-X_left)/2));


        this.color=convertColor(color);
        this.shape=shape;
    }
    private Color convertColor(String colorStr)
    {
        switch (colorStr.toLowerCase())
        {
            case "rouge":
                return Color.RED;
            case "bleu":
                return Color.BLUE;
            case "vert":
                return Color.GREEN;

        }

        return null;
    }
    public void paintComponent(Graphics g)
    {   super.paintComponent(g);
        g.setColor(this.color);
        switch (shape)
        {
            case "triangle":
                DrawTriangle(g);
                break;
            case "ovale":
                DrawOvale(g);
                break;
            case "Rectangle":
                DrawRectangle(g);
                break;

        }

    }
    void DrawTriangle(Graphics g)
    {   y=new int[]{Y1,Y2,Y3};
        x=new int[]{X_left,X_center,X_right};
        g.fillPolygon(x,y,3);
    }
    void DrawOvale(Graphics g)
    {
        g.fillOval(X_center, height/2, 75, 75);
    }
    void DrawRectangle(Graphics g)
    {
        g.fillRect(X_center, height/2, 50, 50);
    }
}
