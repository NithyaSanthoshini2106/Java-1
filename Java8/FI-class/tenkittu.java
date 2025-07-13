import java.util.function.Consumer;

public class tenkittu {
    public static void main(String[] args) {
        Consumer<String> printer = str -> System.out.println(str.toUpperCase());
        printer.accept("java full stack developer"); 
    }
}
