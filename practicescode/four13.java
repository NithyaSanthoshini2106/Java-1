import javax.swing.*;
import java.awt.event.*;

public class four13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JLabel resultLabel = new JLabel("Result:");
        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JButton addButton = new JButton("Add");

        num1.setBounds(50, 50, 100, 30);
        num2.setBounds(160, 50, 100, 30);
        addButton.setBounds(100, 100, 80, 30);
        resultLabel.setBounds(50, 150, 200, 30);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(num1.getText());
                    int b = Integer.parseInt(num2.getText());
                    resultLabel.setText("Result: " + (a + b));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Enter valid numbers");
                }
            }
        });

        frame.add(num1);
        frame.add(num2);
        frame.add(addButton);
        frame.add(resultLabel);
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
