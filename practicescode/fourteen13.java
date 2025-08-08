import javax.swing.*;
import java.awt.event.*;

public class fourteen13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Quiz");
        JLabel questionLabel = new JLabel("Which is the capital of France?");
        JRadioButton opt1 = new JRadioButton("Berlin");
        JRadioButton opt2 = new JRadioButton("Madrid");
        JRadioButton opt3 = new JRadioButton("Paris");
        JRadioButton opt4 = new JRadioButton("Rome");
        ButtonGroup group = new ButtonGroup();
        JButton submit = new JButton("Submit");
        JLabel result = new JLabel("");

        questionLabel.setBounds(20, 20, 300, 30);
        opt1.setBounds(20, 60, 100, 30);
        opt2.setBounds(20, 90, 100, 30);
        opt3.setBounds(20, 120, 100, 30);
        opt4.setBounds(20, 150, 100, 30);
        submit.setBounds(20, 190, 100, 30);
        result.setBounds(20, 230, 200, 30);

        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);

        submit.addActionListener(e -> {
            if (opt3.isSelected()) {
                result.setText("Correct!");
            } else {
                result.setText("Wrong. Answer is Paris.");
            }
        });

        frame.add(questionLabel);
        frame.add(opt1);
        frame.add(opt2);
        frame.add(opt3);
        frame.add(opt4);
        frame.add(submit);
        frame.add(result);
        frame.setSize(350, 320);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
