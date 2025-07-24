import java.util.*;
import java.util.stream.Collectors;

public class Testsixnithu {

    public static void main(String[] args) {
      
        List<Integer> numbers = Arrays.asList(18, 31, 11, 8, 7, 55, 232, 18, 31);
        
        Set<Integer> dupl_Numbers = numbers.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());
        
        System.out.println(dupl_Numbers);
    }
}
