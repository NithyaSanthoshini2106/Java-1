import java.util.List;
import java.util.Arrays;
import java.util.function.Function;

public class Functionone {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 34, 56, 778, 5, 98);
        
        Function<List<Integer>, Integer> f = nums -> nums.size();
        
        System.out.println(f.apply(numbers));  
    }
}
