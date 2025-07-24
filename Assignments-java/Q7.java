import java.util.*;
import java.util.stream.*;

public class Q7 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nithya", "Raju", "Maama", "NithuRaju", "Spoorthi");

        
        System.out.println("Collection API :");
        for (String name : names) {
            if (name.startsWith("R")) {
                System.out.println(name);
            }
        }
        System.out.println("\nStream API:");
        names.stream()
             .filter(n -> n.startsWith("N "))
             .forEach(System.out::println);
    }
}
