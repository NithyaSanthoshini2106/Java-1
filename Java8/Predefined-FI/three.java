import java.util.function.Consumer;

public class three {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("World");
    }
}
