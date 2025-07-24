import java.util.function.Consumer;
import java.util.List;

public class Predefinedcon{
    public static void main(String[] args) {
        Consumer<String> shout = s -> System.out.println(s.toUpperCase()); 

        List.of("hello", "lambda").forEach(shout);
        
    }
}
