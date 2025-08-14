import java.util.*;
import java.util.stream.Collectors;

class Fruit {
    String name;
    Fruit(String name) { this.name = name; }
    public String toString() { return name; }
}

public class Demo21 {
    public static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
    public void printWithPrefix(String s) {
        System.out.println("Prefix: " + s);
    }

    public static void main(String[] args) {
        System.out.println("Static Method Reference:");
        Arrays.asList("3", "1", "4")
              .stream()
              .map(Demo21::stringToInt) 
              .forEach(System.out::println);

    }
}
