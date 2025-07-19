import java.util.*;

public class practicetwo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");  
        System.out.println(fruits);
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple"); 
        System.out.println(uniqueFruits);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(1, "Updated One");  
        System.out.println(map);
        System.out.println("\nIterating List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("\nIterating Set:");
        for (String fruit : uniqueFruits) {
            System.out.println(fruit);
        }
        System.out.println("\nIterating Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
