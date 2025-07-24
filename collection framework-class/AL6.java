import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors; 

public class AL6 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 34, 44, 66, 77, 7, 6);

        List<Integer> even_nums = numbers.stream()
            .filter(num -> num % 2 == 0) 
            .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(even_nums);
    }
}
