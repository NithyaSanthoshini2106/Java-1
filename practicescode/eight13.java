import javax.swing.*;

public class eight13
 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Selector");
        JLabel label = new JLabel("Select your country:");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"India", "USA", "UK", "Canada"});
        JButton show = new JButton("Show");
        JLabel output = new JLabel();

        label.setBounds(50, 50, 150, 30);
        comboBox.setBounds(200, 50, 120, 30);
        show.setBounds(100, 100, 100, 30);
        output.setBounds(50, 150, 300, 30);

        show.addActionListener(e -> {
            String selected = (String) comboBox.getSelectedItem();
            output.setText("You selected: " + selected);
        });

        frame.add(label);
        frame.add(comboBox);
        frame.add(show);
        frame.add(output);
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
