import java.util.*;
import java.util.stream.Collectors;

class Fruit {
    String name;
    Fruit(String name) { this.name = name; }
    public String toString() { return name; }
}

public class Demo23 {
    public static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
    public void printWithPrefix(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.println("\nInstance Method Reference (arbitrary object):");
        Arrays.asList("banana", "apple", "cherry")
              .stream()
              .sorted(String::compareToIgnoreCase)
              .forEach(System.out::println);

        
    }
}
