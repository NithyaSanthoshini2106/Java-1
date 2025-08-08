import javax.swing.*;
import java.awt.event.*;

public class sixteen13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adder");

        JLabel num1Label = new JLabel("Number 1:");
        JTextField num1Field = new JTextField();
        JLabel num2Label = new JLabel("Number 2:");
        JTextField num2Field = new JTextField();
        JButton addButton = new JButton("Add");
        JLabel result = new JLabel("");

        num1Label.setBounds(30, 30, 80, 30);
        num1Field.setBounds(120, 30, 150, 30);
        num2Label.setBounds(30, 70, 80, 30);
        num2Field.setBounds(120, 70, 150, 30);
        addButton.setBounds(100, 120, 100, 30);
        result.setBounds(30, 170, 250, 30);

        addButton.addActionListener(e -> {
            try {
                int n1 = Integer.parseInt(num1Field.getText());
                int n2 = Integer.parseInt(num2Field.getText());
                int sum = n1 + n2;
                result.setText("Sum: " + sum);
            } catch (NumberFormatException ex) {
                result.setText("Enter valid numbers.");
            }
        });

        frame.add(num1Label);
        frame.add(num1Field);
        frame.add(num2Label);
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(result);

        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
