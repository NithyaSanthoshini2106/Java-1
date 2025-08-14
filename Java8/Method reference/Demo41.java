import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Demo41 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Tom", "Mike", "Anna");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
       
        System.out.println("\nmin & max:");
        names.stream().min(String::compareTo).ifPresent(min -> System.out.println( min));
        names.stream().max(String::compareTo).ifPresent(max -> System.out.println(max));
    }
}
