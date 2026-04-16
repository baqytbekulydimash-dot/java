import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task7KeyEventShowSymbol extends Applet implements KeyListener {
    String symbol = "";

    public void init() {
        addKeyListener(this);
        setFocusable(true);
    }

    public void keyTyped(KeyEvent e) {
        symbol = String.valueOf(e.getKeyChar());
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Symbol: " + symbol, 100, 100);
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
}