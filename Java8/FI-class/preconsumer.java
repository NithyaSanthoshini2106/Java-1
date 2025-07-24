import java.util.function.Consumer;

public class preconsumer {
    public static void main(String[] args) {
        Consumer<String> greet = name -> System.out.println("Hello, " + name);
        greet.accept("Nithya");  // Output: Hello, Nithya
    }
}
