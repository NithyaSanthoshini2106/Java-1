import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class two {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Nithya", "Spoorthi", "Kiran", "Anu", "Anu");
        System.out.println("Names:");
        names.forEach(name -> System.out.println(name));
        System.out.println("\nNames (Method Reference):");
        names.forEach(System.out::println);
        System.out.println("\nNames starting with 'S':");
        names.stream()
             .filter(n -> n.startsWith("S"))
             .forEach(System.out::println);
        System.out.println("\nSorted Names:");
        names.stream()
             .sorted((a, b) -> a.compareToIgnoreCase(b))
             .forEach(System.out::println);
        System.out.println("\nUnique Names:");
        names.stream()
             .distinct()
             .forEach(System.out::println);
        System.out.println("\nName Lengths:");
        names.stream()
             .map(n -> n + " (" + n.length() + ")")
             .forEach(System.out::println);
        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());
        System.out.println(upperNames);
        String joined = names.stream()
                             .reduce("", (a, b) -> a + b + " ");
        System.out.println(joined.trim());
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        nums.removeIf(n -> n % 2 == 0);
        System.out.println(nums);
        Consumer<String> printWithStars = s -> System.out.println(s);
        printWithStars.accept("Hello Lambda");
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());
    }
}
