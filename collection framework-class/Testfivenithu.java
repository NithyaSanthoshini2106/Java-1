import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Testfivenithu {

    public static void main(String[] args) {
      
        List<Integer> numbers = Arrays.asList(18, 31, 11, 8, 7, 55, 232, 18, 31);
        
        Set<Integer> dupl_Numbers = numbers.stream()
            .filter(num -> Collections.frequency(numbers, num) > 1)
            .collect(Collectors.toSet());
        
        System.out.println(dupl_Numbers);
    }
}
