import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Consumerone {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 34, 56, 778, 5, 98);

        Function<List<Integer>, Integer> f = nums -> nums.size();
        System.out.println(f.apply(numbers));  // Output: 6

        Predicate<List<Integer>> p = nums -> nums.isEmpty();
        System.out.println(p.test(numbers));  // Output: false 

        Consumer<List<Integer>> c = nums -> {
            for (Integer num : nums) {
                System.out.println(num);
            }
        };

        c.accept(numbers);
    }
}
