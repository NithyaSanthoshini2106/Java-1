import java.util.function.Supplier;

public class presupplier {
    public static void main(String[] args) {
        Supplier<String> getName = () -> "Spoorthi";
        System.out.println(getName.get());  // Output: Spoorthi
    }
}
