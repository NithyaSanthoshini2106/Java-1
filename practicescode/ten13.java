import javax.swing.*;
import java.awt.*;

public class ten13 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 200, 100);
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 200, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Drawing");
        ten13 panel = new ten13();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
