import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Listarray3 {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Nithya", "Raju", "Spoorthi", "Kiran", "Rajunithuraju");

        List<String> long_names = enames.stream()
            .filter(name -> name.length() > 5)
            .collect(Collectors.toList());

    
        System.out.println("Names with more than 5 characters:");
        long_names.forEach(System.out::println);
    }
}
