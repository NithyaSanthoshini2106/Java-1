import java.util.*;

public class Collectionthree {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        names.add("Nithya");
        names.add("Raju");
        names.add("Spoorthi");
        names.add("Nithya"); 

        System.out.println("List:");
        for(String name : names) {
            System.out.println(name);
        }

       
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); 

        System.out.println("\nSet:");
        for(Integer number : numbers) {
            System.out.println(number);
        }

       
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Nithya");
        studentMap.put(102,  "Raju");
        studentMap.put(103, "Spoorthi");

        System.out.println("\nMap:");
        for(Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
