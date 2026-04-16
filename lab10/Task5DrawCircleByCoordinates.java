import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task5DrawCircleByCoordinates extends Applet implements ActionListener {
    TextField xField, yField;
    Button button;
    int x = 100, y = 100;

    public void init() {
        xField = new TextField(5);
        yField = new TextField(5);
        button = new Button("Draw");

        add(new Label("X:"));
        add(xField);
        add(new Label("Y:"));
        add(yField);
        add(button);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            x = Integer.parseInt(xField.getText());
            y = Integer.parseInt(yField.getText());
        } catch (Exception ex) {
            x = 100;
            y = 100;
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.drawOval(x, y, 50, 50);
    }
}