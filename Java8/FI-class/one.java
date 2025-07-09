import java.util.List;
import java.util.Arrays;


@FunctionalInterface
interface PredicateOne {
    boolean test(List<Integer> numbers);
}

public class one {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(21, 34, 5, 678, 9, 65);

        PredicateOne p1 = nums -> nums.isEmpty();

        System.out.println(p1.test(numbers));  // Output: false
    }
}
