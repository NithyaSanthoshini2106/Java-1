import java.util.*;
import java.util.stream.Collectors;

public class Testsevennithu {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(18, 31, 11, 8, 7, 55, 232, 18, 31);

        Set<Integer> uniqueOnly = numbers.stream()
            .filter(num -> Collections.frequency(numbers, num) == 1)
            .collect(Collectors.toSet());

        System.out.println("Unique elements only: " + uniqueOnly);
    }
}
