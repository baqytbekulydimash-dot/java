import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task2ButtonText extends Applet implements ActionListener {
    Button button;
    String message = "";

    public void init() {
        button = new Button("Click");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Hello Java";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 100, 100);
    }
}