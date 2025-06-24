import java.util.ArrayList;

public class one {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Access elements
        System.out.println("First fruit: " + fruits.get(0));

        // Display all elements
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Size of ArrayList
        System.out.println("Total fruits: " + fruits.size());

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Check if list contains an item
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
    }
}
