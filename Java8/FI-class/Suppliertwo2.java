import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Suppliertwo2 {
    public static void main(String[] args) {

        // Supplier: returns 100
        Supplier<Integer> s1 = () -> 100;
        System.out.println(s1.get());  // Output: 100

        // Function: checks if string length > 5
        Function<String, Boolean> f1 = ename -> ename.length() > 5;
        System.out.println(f1.apply("Nithya"));  // Output: true

        
    }
}
