import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class five13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        JButton redBtn = new JButton("Red");
        JButton greenBtn = new JButton("Green");

        redBtn.setBounds(50, 50, 100, 30);
        greenBtn.setBounds(160, 50, 100, 30);

        redBtn.addActionListener(e -> frame.getContentPane().setBackground(Color.RED));
        greenBtn.addActionListener(e -> frame.getContentPane().setBackground(Color.GREEN));

        frame.add(redBtn);
        frame.add(greenBtn);
        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
