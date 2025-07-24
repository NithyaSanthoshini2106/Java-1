import java.util.function.Predicate;

public class predi {
    public static void main(String[] args) {
        Predicate<String> isPalindrome = s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

        System.out.println(isPalindrome.test("madam"));  // true
        System.out.println(isPalindrome.test("nithya")); // false
    }
}
