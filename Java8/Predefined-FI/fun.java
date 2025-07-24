import java.util.function.Function;

public class fun {
    public static void main(String[] args) {
        Function<Double, Double> celsiusToFahrenheit = c -> (c * 9/5) + 32;

        System.out.println(celsiusToFahrenheit.apply(37.0) ) ;
    }
}
