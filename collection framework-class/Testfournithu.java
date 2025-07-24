import java.util.Arrays;
import java.util.List;

public class Testfournithu {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        int evenSum = numbers.stream()
                             .filter(n -> n % 2 == 0)
                             .mapToInt(n -> n)
                             .sum();

        System.out.println(evenSum);
    }
}
