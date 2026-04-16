import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task10CheckboxColors extends Applet implements ItemListener {
    Checkbox red, green, blue;
    Color selectedColor = Color.RED;

    public void init() {
        red = new Checkbox("Red");
        green = new Checkbox("Green");
        blue = new Checkbox("Blue");

        add(red);
        add(green);
        add(blue);

        red.addItemListener(this);
        green.addItemListener(this);
        blue.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (red.getState()) {
            selectedColor = Color.RED;
        } else if (green.getState()) {
            selectedColor = Color.GREEN;
        } else if (blue.getState()) {
            selectedColor = Color.BLUE;
        }

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(selectedColor);
        g.fillRect(100, 100, 100, 100);
    }
}