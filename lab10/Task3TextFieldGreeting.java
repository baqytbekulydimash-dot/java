import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task3TextFieldGreeting extends Applet implements ActionListener {
    TextField nameField;
    Button button;
    String message = "";

    public void init() {
        nameField = new TextField(20);
        button = new Button("OK");

        add(new Label("Enter your name:"));
        add(nameField);
        add(button);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Сәлем, " + nameField.getText();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 100, 120);
    }
}