import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Listarray12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 43, 56, 78, 9, 98, 5);

        List<Integer> squaredOdds = numbers.stream()
            .filter(num -> num % 2 != 0)    
            .map(num -> num * num)        
            .collect(Collectors.toList()); 

        System.out.println(squaredOdds);
    }
}
