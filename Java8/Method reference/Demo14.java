import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Person {
    String name;
    int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    public String toString() { return name + " (" + age + ")"; }
}

public class Demo14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> names = Arrays.asList("Nithya", "Killi", "Rajunithu", "Varma");
        List<String> filteredNames = names.stream()
                .filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredNames);

    }

}