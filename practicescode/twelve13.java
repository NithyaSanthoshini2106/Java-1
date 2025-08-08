import javax.swing.*;
import java.awt.event.*;

public class twelve13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI Calculator");

        JLabel weightLabel = new JLabel("Weight (kg):");
        JTextField weightField = new JTextField();
        JLabel heightLabel = new JLabel("Height (m):");
        JTextField heightField = new JTextField();
        JButton calcButton = new JButton("Calculate BMI");
        JLabel resultLabel = new JLabel("");

        weightLabel.setBounds(30, 30, 100, 30);
        weightField.setBounds(150, 30, 100, 30);
        heightLabel.setBounds(30, 70, 100, 30);
        heightField.setBounds(150, 70, 100, 30);
        calcButton.setBounds(80, 120, 140, 30);
        resultLabel.setBounds(30, 170, 250, 30);

        calcButton.addActionListener(e -> {
            try {
                double weight = Double.parseDouble(weightField.getText());
                double height = Double.parseDouble(heightField.getText());
                double bmi = weight / (height * height);
                resultLabel.setText("Your BMI is: " + String.format("%.2f", bmi));
            } catch (Exception ex) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });

        frame.add(weightLabel);
        frame.add(weightField);
        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(calcButton);
        frame.add(resultLabel);
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
