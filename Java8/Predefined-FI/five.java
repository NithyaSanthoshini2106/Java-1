import java.util.function.BiPredicate;

public class five {
    public static void main(String[] args) {
        BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
        System.out.println(checkLength.test("Java", 4)); // true
    }
}
