import java.util.function.Supplier;

public class ninekittu {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Hello from Supplier!";
        System.out.println(message.get());
    }
}
