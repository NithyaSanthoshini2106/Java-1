import java.util.*;
import java.util.stream.Collectors;

class Fruit {
    String name;
    Fruit(String name) { this.name = name; }
    public String toString() { return name; }
}

public class Demo10 {

 
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
              .map(Demo10::stringToInt) 
              .forEach(System.out::println);
        System.out.println("\nInstance Method Reference (particular object):");
        Demo10 demo = new Demo10();
        Arrays.asList("Java", "Lambda")
              .forEach(demo::printWithPrefix);
        System.out.println("\nInstance Method Reference (arbitrary object):");
        Arrays.asList("banana", "apple", "cherry")
              .stream()
              .sorted(String::compareToIgnoreCase)
              .forEach(System.out::println);
        System.out.println("\nConstructor Method Reference:");
        List<String> names = Arrays.asList("Mango", "Orange");
        List<Fruit> fruits = names.stream()
                                  .map(Fruit::new)
                                  .collect(Collectors.toList());
        fruits.forEach(System.out::println);
    }
}
