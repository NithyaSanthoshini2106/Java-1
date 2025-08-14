import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Person {
    String name;
    int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    public String toString() { return name + " (" + age + ")"; }
}

public class Demo20 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> names = Arrays.asList("Nithya", "nithuraju", "killraju", "Varmaraju");
        Runnable task = () -> System.out.println("Hello from Lambda!");
        task.run();
        numbers.forEach(n -> System.out.println( n));
        names.forEach(System.out::println);
        List<String> filteredNames = names.stream()
                .filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredNames);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        Optional<String> optionalName = names.stream().filter(n -> n.startsWith("Z")).findFirst();
        System.out.println( optionalName.orElse("No name found"));
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));
        Supplier<Double> randomSupplier = Math::random;
        System.out.println(randomSupplier.get());
        List<Person> people = names.stream()
                .map(name -> new Person(name, new Random().nextInt(50) + 20))
                .collect(Collectors.toList());
        people.forEach(System.out::println);
    }
}
