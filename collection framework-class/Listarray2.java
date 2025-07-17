import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Listarray2 {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Spoorthi", "Nithya", "Spoorthika", "Kiran", "Raju");

        List<String> s_names = enames.stream()
            .filter(name -> name.startsWith("S"))
            .collect(Collectors.toList());

       
        System.out.println("Names starting with S:");
        s_names.forEach(System.out::println);
    }
}
