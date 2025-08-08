import javax.swing.*;
import java.awt.event.*;

public class nine13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Click Tracker");
        JLabel label = new JLabel("Click anywhere in the frame");
        label.setBounds(50, 50, 300, 30);

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        frame.add(label);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
