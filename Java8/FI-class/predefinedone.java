import java.util.function.Supplier;
import java.util.function.Function;

public class predefinedone {
    public static void main(String[] args) {

        
        Supplier<String> greetSupplier = () -> "Hello, Nithya";
        System.out.println(greetSupplier.get());  // Output: Hello, Nithya

        
        Function<String, String> greetFunction = name -> "Hello, " + name;
        System.out.println(greetFunction.apply("Nithya"));  // Output: Hello, Nithya
    }
}
