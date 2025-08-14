import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Fruit {
    String name;
    Fruit(String name) { this.name = name; }
    public String toString() { return name; }
}

public class Demo9 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mango", "Orange");
        List<Fruit> fruits = names.stream()
                                  .map(Fruit::new) // constructor reference
                                  .collect(Collectors.toList());
        fruits.forEach(System.out::println);
    }
}
