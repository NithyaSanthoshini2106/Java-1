import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AL5 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 40, 20);

        Set<Integer> uniqueNumbers = numbers.stream()
                                            .collect(Collectors.toSet());

        System.out.println(numbers);
        System.out.println(uniqueNumbers);
    }
}
