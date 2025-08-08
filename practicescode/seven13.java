import javax.swing.*;

public class seven13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Select Gender");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        JButton submit = new JButton("Submit");
        JLabel result = new JLabel();

        male.setBounds(100, 50, 100, 30);
        female.setBounds(100, 80, 100, 30);
        submit.setBounds(100, 120, 100, 30);
        result.setBounds(100, 160, 200, 30);

        group.add(male);
        group.add(female);

        submit.addActionListener(e -> {
            if (male.isSelected()) result.setText("Selected: Male");
            else if (female.isSelected()) result.setText("Selected: Female");
            else result.setText("Nothing selected.");
        });

        frame.add(male);
        frame.add(female);
        frame.add(submit);
        frame.add(result);
        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
