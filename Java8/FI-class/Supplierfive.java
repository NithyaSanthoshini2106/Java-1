import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Supplierfive {
    public static void main(String[] args) {

         
        Function<String, Boolean> f = (ename) -> ename.length() > 5;
        System.out.println(f.apply("NITHYA SPOORTHI"));  // Output: false
        Predicate<Integer> p = (price) -> price >= 10000;
        System.out.println(p.test(1000));      // Output: false
        Consumer<String> c = (ename) -> {
            System.out.println(ename.toLowerCase());
        };
        c.accept("NITHYA SPOORTHI");                     
        Supplier<Integer> s = () -> 1000;
        System.out.println(s.get());          
    }
}
