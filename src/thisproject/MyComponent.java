package thisproject;

import javax.swing.*;
import java.awt.*;

public class MyComponent extends JPanel {
    protected Color color=null;
    protected String shape=null;
    public MyComponent(String color,String shape)
    {
        this.color=convertColor(color);this.shape=shape;
    }
    private Color convertColor(String colorStr)
    {
        switch (colorStr.toLowerCase())
        {
            case "red":
                return Color.RED;
            case "blue":
                return Color.BLUE;
            case "vert":
                return Color.GREEN;

        }

        return null;
    }
    public void paintComponent(Graphics g)
    {   g.setColor(this.color);
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
    {
        //

    }
    void DrawOvale(Graphics g)
    {

    }
    void DrawRectangle(Graphics g)
    {
        g.fillRect(50, 50, 50, 50);
    }
}
