import javax.swing.*;
import java.awt.event.*;

public class elevent13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Celsius to Fahrenheit");

        JLabel celsiusLabel = new JLabel("Celsius:");
        JTextField celsiusField = new JTextField();
        JButton convertButton = new JButton("Convert");
        JLabel resultLabel = new JLabel("Fahrenheit: ");

        // Set positions
        celsiusLabel.setBounds(50, 50, 80, 30);
        celsiusField.setBounds(150, 50, 100, 30);
        convertButton.setBounds(100, 100, 100, 30);
        resultLabel.setBounds(50, 150, 200, 30);

        // Add action listener
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(celsiusField.getText());
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    resultLabel.setText("Fahrenheit: " + fahrenheit);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number.");
                }
            }
        });

        // Add components
        frame.add(celsiusLabel);
        frame.add(celsiusField);
        frame.add(convertButton);
        frame.add(resultLabel);

        // Frame settings
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
