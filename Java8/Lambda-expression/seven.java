import java.util.*;
import java.util.stream.Collectors;

public class seven {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "lambda");
        List<String> upper = names.stream()
                                  .map(String::toUpperCase)
                                  .collect(Collectors.toList());
        System.out.println(upper); 
    }
}
