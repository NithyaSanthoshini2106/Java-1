import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class threenithya {

    public static void main(String[] args) {

        
        Supplier<List<Integer>> s1 = () -> {
            Random rand = new Random();
            return rand.ints(10, 1, 101)      
                      .boxed()
                      .collect(Collectors.toList());
        };

        
        Predicate<Integer> p1 = n -> n % 2 == 0;

        
        Function<Integer, Integer> f1 = n -> n * n;

        
        Consumer<Integer> printer = n -> System.out.print(n + " ");

       
        List<Integer> randomNumbers = s1.get();
        System.out.println("Original list:");
        randomNumbers.forEach(printer);

        List<Integer> processed =
            randomNumbers.stream()
                         .filter(p1)   
                         .map(f1)      
                         .collect(Collectors.toList());

        System.out.println("\n\nProcessed list (even numbers squared):");
        processed.forEach(printer);
    }
}
