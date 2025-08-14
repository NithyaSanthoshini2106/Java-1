import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Demo25 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Tom", "Mike", "Anna");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("forEach:");
        names.forEach(System.out::println);
    }
}
