import java.util.*;

public class Collectionfive {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Nithya");
        studentMap.put(102, "Raju");
        studentMap.put(103, "Spoorthi");
        studentMap.put(104, "Nithu");

        System.out.println("\nMap:");
        for(Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
