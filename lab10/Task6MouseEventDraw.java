import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task6MouseEventDraw extends Applet implements MouseListener {
    int x = -1, y = -1;

    public void init() {
        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        if (x != -1 && y != -1) {
            g.fillOval(x, y, 5, 5);
            g.drawString("X: " + x + " Y: " + y, 20, 50);
        }
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}