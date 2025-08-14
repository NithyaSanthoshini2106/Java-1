import java.util.*;
import java.util.stream.Collectors;

class Fruit {
    String name;
    Fruit(String name) { this.name = name; }
    public String toString() { return name; }
}

public class Demo24 {
    public static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
    public void printWithPrefix(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.println("\nConstructor Method Reference:");
        List<String> names = Arrays.asList("Mango", "Orange");
        List<Fruit> fruits = names.stream()
                                  .map(Fruit::new)
                                  .collect(Collectors.toList());
        fruits.forEach(System.out::println);
    }
}
