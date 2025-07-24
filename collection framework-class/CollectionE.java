import java.util.*;

public class CollectionE {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Nithya");
        students.put(2, "Spoorthi");
        students.put(3, "Raju");

        System.out.println("Students in HashMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
