import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate; // ✅ Required for Predicate<List>

interface Predicate_One{
    public  abstract  boolean test(List numbers);
}
public class three {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(18,31,11,8,2015,171);
        Predicate_One p1 = numbers1 -> numbers1.isEmpty();
        System.out.println(p1.test(numbers));

        
    }
}