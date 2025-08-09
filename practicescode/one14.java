import java.util.*;

public class one14 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 85);
        marks.put("Bob", 90);
        marks.put("Charlie", 78);
        System.out.println( marks.get("Bob"));
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey()+ entry.getValue());
        }
    }
}
