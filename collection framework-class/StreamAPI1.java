import java.util.Arrays;
import java.util.List;

public class StreamAPI1 {

    public static void main(String[] args) {
        List<String> enames = Arrays.asList("nithya", "Spoorthi", "Raju");

        
        enames.replaceAll(String::toUpperCase);

        System.out.println(enames);
    }
}
