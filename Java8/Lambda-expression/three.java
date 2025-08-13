import java.util.function.Supplier;

public class three {
    public static void main(String[] args) {
        Supplier<Double> randomNumber = () -> Math.random();
        Supplier<String> greeting = () -> "Hello from Supplier!";
        System.out.println(randomNumber.get());
        System.out.println(greeting.get());
    }
}
