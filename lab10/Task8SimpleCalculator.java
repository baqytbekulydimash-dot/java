import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task8SimpleCalculator extends Applet implements ActionListener {
    TextField num1Field, num2Field;
    Button addButton;
    String result = "";

    public void init() {
        num1Field = new TextField(5);
        num2Field = new TextField(5);
        addButton = new Button("Add");

        add(new Label("Number 1:"));
        add(num1Field);
        add(new Label("Number 2:"));
        add(num2Field);
        add(addButton);

        addButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(num1Field.getText());
            int b = Integer.parseInt(num2Field.getText());
            result = "Result: " + (a + b);
        } catch (Exception ex) {
            result = "Invalid input";
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(result, 100, 120);
    }
}