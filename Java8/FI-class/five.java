import java.util.List;
import java.util.Arrays;

@FunctionalInterface
interface Predicate_Two {
    boolean test(List<Integer> numbers);
}

public class five implements Predicate_Two {
    @Override
    public boolean test(List<Integer> numbers) {
        return numbers.isEmpty();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(18, 31, 11, 8, 2015, 171);
        Predicate_Two p1 = new five();
        System.out.println(p1.test(numbers));  
    }
}
