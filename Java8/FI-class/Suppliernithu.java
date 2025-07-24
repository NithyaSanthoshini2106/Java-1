import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Suppliernithu {
    public static void main(String[] args) {

        // Supplier: returns 100
        Supplier<Integer> s1 = () -> 100;
        System.out.println(s1.get());  // Output: 100

        // Function: checks if string length > 5
        Function<String, Boolean> f1 = ename -> ename.length() > 5;
        System.out.println(f1.apply("Nithya"));  // Output: true

        // Predicate: checks if value is equal to 1000
        Predicate<Integer> p1 = price -> price == 1000;
        System.out.println(p1.test(1000));  // ✅ Output: true

        // Consumer: prints a string
        Consumer<String> c1 = num -> System.out.println(num);
        c1.accept("100");  // ✅ Output: 100
    }
}
