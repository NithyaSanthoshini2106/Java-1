import java.util.*;

public class Collectiontwo {
    public static void main(String[] args) {
        
        // 1. List Example (ArrayList)
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
    }
}
