import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Demo40 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Tom", "Mike", "Anna");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("\npeek:");
        names.stream()
             .filter(n -> n.length() > 3)
             .peek(n -> System.out.println("Debug: " + n))
             .map(String::toUpperCase)
             .forEach(System.out::println);

       
    }
}
