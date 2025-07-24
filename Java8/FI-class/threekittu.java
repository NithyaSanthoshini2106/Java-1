import java.util.Arrays;
import java.util.List;

public class threekittu {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nithya", "Spoorthi", "Java", "lanbad");

        names.stream()
             .filter(name -> name.startsWith("S"))
             .forEach(System.out::println); 
    }
}
