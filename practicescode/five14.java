import javax.swing.*;
import java.awt.*;
import java.util.*;

public class five14 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Map Display");
        Map<String, Integer> marks = new LinkedHashMap<>();
        marks.put("Nithya Raju", 85);
        marks.put("Kiran Raju", 92);
        marks.put("Varma Raju", 78);
        marks.put("Kiranithya Raju", 88);
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        StringBuilder sb = new StringBuilder();
        sb.append("Name\tMarks\n");
        sb.append("-----------------\n");

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            sb.append(entry.getKey()).append("\t").append(entry.getValue()).append("\n");
        }
        textArea.setText(sb.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
