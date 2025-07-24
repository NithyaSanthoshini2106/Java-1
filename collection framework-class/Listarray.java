import java.util.List;
import java.util.Arrays;

public class Listarray {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Nithya", "Spoorthi", "Kiran", "Raju");

      
        for (String name : enames) {
            System.out.println(name);
        }
    }
}
