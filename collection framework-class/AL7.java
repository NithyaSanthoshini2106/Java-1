import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AL7 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 34, 44, 66, 77, 7, 6);

        List<Integer> even_numbers = numbers.stream()
            .filter(num -> num % 2 == 0) 
            .collect(Collectors.toList());

        List<Integer> odd_numbers = numbers.stream()
            .filter(num -> num % 2 != 0) 
            .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(even_numbers);
        System.out.println(odd_numbers);
    }
}
