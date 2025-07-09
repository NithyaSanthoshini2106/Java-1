import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predecateone {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 34, 56, 778, 5, 98);

        Function<List<Integer>, Integer> f = nums -> nums.size();
        System.out.println(f.apply(numbers));  // Output: 6

        Predicate<List<Integer>> p = nums -> nums.isEmpty();
        System.out.println(p.test(numbers));  // Output: false (since list is not empty)
    }
}
