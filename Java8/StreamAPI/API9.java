import java.util.*;
import java.util.stream.Collectors;

public class API9 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> names = Arrays.asList("nithya", "spoorthi", "java", "python", "java");
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
        System.out.println("Even Numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
        System.out.println("\nNames in Uppercase:");
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
        System.out.println("\nSorted Fruits:");
        fruits.stream()
              .sorted()
              .forEach(System.out::println);
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("\nSum of Numbers: " + sum);
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());
        System.out.println("\nEven Numbers List: " + evens);
        long javaCount = names.stream()
                              .filter(w -> w.equalsIgnoreCase("java"))
                              .count();
        System.out.println("\nCount of 'java': " + javaCount);
    }
}
