import java.util.Arrays;
import java.util.List;

public class Testonenithu {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(43, 54, 87, 4, 6, 65, 786);

        // reduce without identity returns Optional
        Integer total = numbers.stream().reduce((a, b) -> a + b).get();

        System.out.println(total);
    }
}
