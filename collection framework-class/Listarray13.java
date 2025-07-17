import java.util.List;
import java.util.Arrays;

public class Listarray13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 43, 56, 78, 9, 98, 5);

        long count = numbers.stream()
            .filter(num -> num > 50)
            .count();

        System.out.println(count);
    }
}
