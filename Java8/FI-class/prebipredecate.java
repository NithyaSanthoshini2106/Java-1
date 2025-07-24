import java.util.function.BiPredicate;

public class prebipredecate {
    public static void main(String[] args) {
        BiPredicate<String, String> isEqual = (a, b) -> a.equals(b);
        System.out.println(isEqual.test("test", "test"));  // Output: true
    }
}
