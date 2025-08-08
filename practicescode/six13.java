import javax.swing.*;
import java.awt.event.*;

public class six13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Greeting App");
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Greet");
        JLabel output = new JLabel("");

        label.setBounds(50, 50, 120, 30);
        textField.setBounds(180, 50, 150, 30);
        button.setBounds(100, 100, 100, 30);
        output.setBounds(50, 150, 300, 30);

        button.addActionListener(e -> {
            String name = textField.getText();
            output.setText("Hello, " + name + "!");
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(output);
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
