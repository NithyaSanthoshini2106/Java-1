import javax.swing.*;

public class eleven14 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Frame");
        JButton button = new JButton("Click Me");

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
