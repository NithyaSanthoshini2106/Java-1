import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate; 

interface Predicate_One{
    public  abstract  boolean test(List numbers);
}
public class four {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(18,31,11,8,2015,171);
        Predicate_One p1 = numbers1 -> numbers1.isEmpty();
        System.out.println(p1.test(numbers));

        Predicate<List> p2= numbers2->numbers2.isEmpty();
        System.out.println(p2.test(numbers));

    }
}