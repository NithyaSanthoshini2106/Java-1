import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Demo33 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Tom", "Mike", "Anna");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("\nallMatch:");
        boolean allHaveLetters = names.stream().allMatch(n -> n.length() > 1);
        System.out.println(allHaveLetters);
    }
}
