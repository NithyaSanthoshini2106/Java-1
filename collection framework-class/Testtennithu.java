import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Testtennithu {

    public static void main(String[] args) {
      
        List<Integer> numbers = Arrays.asList(18, 31, 11, 8, 7, 55, 232, 18, 31);
        
        List<Integer> desc_Numbers = numbers.stream()
            .sorted(Comparator.reverseOrder())  // For descending order
            .collect(Collectors.toList());

        System.out.println(desc_Numbers);
    }
}
