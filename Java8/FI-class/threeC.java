import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class threeC {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(90, 86, 74, 92, 88);

        
        OptionalDouble average = scores.stream()
                                       .mapToInt(Integer::intValue)
                                       .average();

        double result = average.orElse(0.0);

        System.out.println(result);
    }
}
