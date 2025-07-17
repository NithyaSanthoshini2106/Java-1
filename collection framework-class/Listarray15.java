import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Listarray15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 43, 56, 78, 9, 98, 5);

        List<Integer> sortedDesc = numbers.stream()
            .sorted((a, b) -> b - a)  
            .collect(Collectors.toList());

        System.out.println(sortedDesc);
    }
}
