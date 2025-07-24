import java.util.ArrayList;

public class Testfive {
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();

        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Print the list
        System.out.println("Fruits List: " + fruits);

        // Get element at index 2
        String fruit = fruits.get(2);
        System.out.println("Element at index 2: " + fruit);

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterate using for-each loop
        System.out.println("Iterating through list:");
        for (String f : fruits) {
            System.out.println(f);
        }

        // Check if list contains an item
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Get size of the list
        System.out.println("List size: " + fruits.size());
    }
}
