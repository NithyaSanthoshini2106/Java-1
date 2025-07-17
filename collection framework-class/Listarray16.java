import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Listarray16 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 43, 56, 12, 78, 9, 43, 98, 5, 9);

        List<Integer> uniqueNumbers = numbers.stream()
            .distinct()  // removes duplicates
            .collect(Collectors.toList());

        System.out.println(uniqueNumbers);
    }
}
