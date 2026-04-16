import java.applet.Applet;
import java.awt.*;

public class Task1DrawShapes extends Applet {
    public void paint(Graphics g) {
        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 70, 45);

        g.drawOval(200, 50, 80, 80);
        g.drawString("Circle", 220, 45);

        g.drawLine(50, 180, 250, 180);
        g.drawString("Line", 130, 170);
    }
}