import java.util.Arrays;
import java.util.List;

public class API4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("nithya", "spoorthi", "java");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println); 
    }
}
