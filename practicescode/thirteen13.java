import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class thirteen13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        JLabel label = new JLabel("Enter a task:");
        JTextField taskField = new JTextField();
        JButton addButton = new JButton("Add");
        JTextArea taskArea = new JTextArea();

        ArrayList<String> tasks = new ArrayList<>();

        label.setBounds(20, 20, 100, 30);
        taskField.setBounds(120, 20, 200, 30);
        addButton.setBounds(120, 60, 100, 30);
        taskArea.setBounds(20, 110, 300, 150);

        addButton.addActionListener(e -> {
            String task = taskField.getText();
            if (!task.isEmpty()) {
                tasks.add(task);
                StringBuilder allTasks = new StringBuilder();
                for (String t : tasks) {
                    allTasks.append("- ").append(t).append("\n");
                }
                taskArea.setText(allTasks.toString());
                taskField.setText("");
            }
        });

        frame.add(label);
        frame.add(taskField);
        frame.add(addButton);
        frame.add(taskArea);
        frame.setSize(370, 320);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
