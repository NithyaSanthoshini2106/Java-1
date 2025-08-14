import java.util.Arrays;

public class Demo7 {
    public static void main(String[] args) {
        String prefix = "Hello ";
        Arrays.asList("Java", "World")
              .forEach(prefix::concat); // method reference to instance method
    }
}
