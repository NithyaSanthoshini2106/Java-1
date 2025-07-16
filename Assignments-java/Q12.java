import java.util.*;
import java.util.stream.*;

public class Q12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raju nithu", "Sita raju ", "Ram raju nithya", "Raju nthya spoorthi", "killi raju");

        // Step-by-step using Stream API
        List<String> result = names.stream()
            .filter(name -> name.startsWith("R"))     
            .map(String::toUpperCase)                  
            .collect(Collectors.toList());             

        System.out.println(result);
    }
}
