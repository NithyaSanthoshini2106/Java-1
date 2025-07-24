import java.util.function.Predicate;
import java.util.function.Consumer;

public class fournithya {
    public static void main(String[] args) {

        
        Predicate<String> isBlank = s -> s == null || s.trim().isEmpty();

        
        Consumer<String> printer = msg -> System.out.println(msg);

       
        String[] samples = { "Hello", "Nithya", "Raju", "Java" };

        for (String s : samples) {
            if (isBlank.test(s)) {
                printer.accept("Blank string detected");
            } else {
                printer.accept(s);
            }
        }
    }
}
