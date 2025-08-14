import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Person {
    String name;
    int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    public String toString() { return name + " (" + age + ")"; }
}

public class Demo19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> names = Arrays.asList("Nithya", "Killi", "Rajunithu", "Varma");


        List<Person> people = names.stream()
                .map(name -> new Person(name, new Random().nextInt(50) + 20))
                .collect(Collectors.toList());
        people.forEach(System.out::println);

    }
}