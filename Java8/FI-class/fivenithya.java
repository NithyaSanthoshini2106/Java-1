import java.util.function.Function;

public class fivenithya {
    public static void main(String[] args) {
        Function<Double, Double> f1 = c -> (c * 9 / 5) + 32;
        double[] tempsC = { 0, 25, 37, 100 };

        for (double c : tempsC) {
            double f = f1.apply(c);
            System.out.printf("%.1f °C = %.1f °F%n", c, f);
        }
    }
}
