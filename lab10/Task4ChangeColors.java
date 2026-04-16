import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task4ChangeColors extends Applet implements ActionListener {
    Button button;
    Color currentColor = Color.RED;
    int colorIndex = 0;

    public void init() {
        button = new Button("Change Color");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        colorIndex++;

        if (colorIndex % 3 == 0) {
            currentColor = Color.RED;
        } else if (colorIndex % 3 == 1) {
            currentColor = Color.GREEN;
        } else {
            currentColor = Color.BLUE;
        }

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(currentColor);
        g.fillOval(100, 100, 100, 100);
    }
}