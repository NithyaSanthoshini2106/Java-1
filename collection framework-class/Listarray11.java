import java.util.List;
import java.util.Arrays;

public class Listarray11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 43, 56, 78, 9, 98);

        int total = numbers.stream()
            .filter(num -> num % 2 == 0)
            .mapToInt(num -> num) 
            .sum();

        System.out.println(total);
    }
}
