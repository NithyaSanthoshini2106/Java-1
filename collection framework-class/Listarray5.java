import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Listarray5 {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Nithya", "Raj", "Spoorthi", "Kiran", "Rajunithuspoorthiraju");

        List<String> sorted_names = enames.stream()
            .sorted()
            .collect(Collectors.toList());

        // Print sorted names
        System.out.println("Sorted Names (A-Z):");
        sorted_names.forEach(System.out::println);
    }
}
