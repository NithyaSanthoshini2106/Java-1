
import java.util.function.Supplier;  
import java.util.List;
import java.util.Arrays;

public class six {
    public static void main(String[] args) {
        Supplier<Integer> s1 = () -> 100;
        Supplier<String> s2 = () -> "Nithya Spoorthi";
        Supplier<Boolean> s3 = () -> 100 > 200;

        System.out.println(s1.get()); // Output: 100
        System.out.println(s2.get()); // Output: Nithya Spoorthi
        System.out.println(s3.get()); // Output: false
    }
}
