import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class predefinedthree {
    public static void main(String[] args) {

      
        Supplier<String> greetSupplier = () -> "Hello, Nithya";
        System.out.println(greetSupplier.get());                     // Output: Hello, Nithya

       
        Function<String, String> greetFunction = name -> "Hello, " + name;
        System.out.println(greetFunction.apply("Nithya"));           // Output: Hello, Nithya

       
        Predicate<String> isLongName = name -> name.length() > 5;
        System.out.println("Is 'Nithya' a long name? " +
                           isLongName.test("Nithya"));               // Output: true

        Consumer<String> greetConsumer = name ->
                System.out.println("Greetings from Consumer → Hello, " + name);
        greetConsumer.accept("Nithya");                              // Output: Greetings…
    }
}
