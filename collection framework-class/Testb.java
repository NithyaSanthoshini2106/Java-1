import java.util.*;

public class Testb {
    public static void main(String[] args) {
        
        List<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana");  // Duplicate 

       
        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        
        System.out.println(fruits.get(0));

        
        fruits.remove("Banana");

        
        System.out.println("\nFruits after removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
