import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Demo29 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Tom", "Mike", "Anna");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("\nreduce:");
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
