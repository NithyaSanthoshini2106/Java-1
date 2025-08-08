import javax.swing.*;
import java.awt.event.*;

public class fiveteen13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel resultLabel = new JLabel("");

        userLabel.setBounds(30, 30, 80, 30);
        userField.setBounds(120, 30, 150, 30);
        passLabel.setBounds(30, 70, 80, 30);
        passField.setBounds(120, 70, 150, 30);
        loginButton.setBounds(100, 120, 100, 30);
        resultLabel.setBounds(30, 160, 300, 30);

        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                resultLabel.setText("Login successful!");
            } else {
                resultLabel.setText("Invalid credentials.");
            }
        });

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(resultLabel);

        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
