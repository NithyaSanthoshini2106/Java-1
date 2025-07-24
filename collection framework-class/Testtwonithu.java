import java.util.Arrays;
import java.util.List;

public class Testtwonithu {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(43, 54, 87, 4, 6, 65, 786);

        int total = numbers.stream().mapToInt(e -> e).sum();

        System.out.println(total);
    }
}
