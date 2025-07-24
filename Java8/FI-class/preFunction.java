import java.util.function.Function;

public class preFunction{
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));  // Output: 25
    }
}
