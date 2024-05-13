package thisproject;

import javax.swing.*;
import java.awt.*;

public class MyComponent extends JPanel {
    protected int width;
    protected int height;
    protected Color color = Color.BLACK;
    protected String shape = "";

    public void setColor(String color) {
        this.color = convertColor(color);
        repaint();
    }

    public void setShape(String shape) {
        this.shape = shape;
        repaint();
    }

    public MyComponent(String color, String shape) {

        this.setPreferredSize(new Dimension(300, 300));

        this.color = convertColor(color);
        this.shape = shape;
    }

    private Color convertColor(String colorStr) {
        switch (colorStr.toLowerCase()) {
            case "rouge":
                return Color.RED;
            case "bleu":
                return Color.BLUE;
            case "vert":
                return Color.GREEN;
            default:
                return Color.BLACK;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        width = getWidth();
        height = getHeight();
        g.setColor(color);

        switch (shape.toLowerCase()) {
            case "triangle":
                drawTriangle(g);
                break;
            case "ovale":
                drawOval(g);
                break;
            case "rectangle":
                drawRectangle(g);
                break;
        }
    }

    private void drawTriangle(Graphics g) {
        int triangleHeight = (int) (Math.sqrt(3) * width / 4);
        int[] xPoints = {width / 2, width / 4, 3 * width / 4};
        int[] yPoints = {height / 2 - triangleHeight / 2, height / 2 + triangleHeight / 2, height / 2 + triangleHeight / 2};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    private void drawOval(Graphics g) {
        g.fillOval(width / 2 - 100, height / 2 - 100, 200, 200);
    }

    private void drawRectangle(Graphics g) {
        g.fillRect(width / 2 - 75, height / 2 - 75, 150, 150);
    }
}
