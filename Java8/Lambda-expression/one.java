import java.util.*;
import java.util.function.*;

public class one {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Hello from a thread!");
        new Thread(task).start();
        List<String> names = Arrays.asList("Nithya", "Spoorthi", "Kiran", "Anu");
        names.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println(names);
        System.out.println("\nNames in Uppercase:");
        names.forEach(n -> System.out.println(n.toUpperCase()));
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("\nIs 10 even? " + isEven.test(10));
        System.out.println("Is 7 even? " + isEven.test(7));
        Function<String, Integer> strLength = s -> s.length();
        System.out.println(strLength.apply("Java"));
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("\nEven Numbers from List:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(5, 10));
    }
}
