import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Listarray4 {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Nithya", "Raj", "Spoorthi", "Kiran", "Rajunithuraju");

        List<String> upper_names = enames.stream()
            .map(name -> name.toUpperCase())
            .collect(Collectors.toList());

       
        System.out.println("Names in UPPERCASE:");
        upper_names.forEach(System.out::println);
    }
}
