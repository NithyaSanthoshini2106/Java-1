import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class practice2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 15, 25, 35);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println(evenNumbers);
        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());
        System.out.println(squares);
        double average = numbers.stream()
                                .mapToInt(n -> n)
                                .average()
                                .orElse(0);
        System.out.println(average);
        int sum = numbers.stream()
                         .mapToInt(n -> n)
                         .sum();
        System.out.println(sum);
    }
}
