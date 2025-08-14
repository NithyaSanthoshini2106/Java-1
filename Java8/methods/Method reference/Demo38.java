import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Demo38 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Tom", "Mike", "Anna");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        System.out.println("\nOptional methods:");
        Optional<String> optName = names.stream().filter(n -> n.startsWith("A")).findFirst();
        System.out.println(optName.orElse("No name found"));
        optName.ifPresent(n -> System.out.println("Found: " + n));

    }
}
