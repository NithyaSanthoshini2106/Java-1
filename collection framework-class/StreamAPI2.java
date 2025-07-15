import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class StreamAPI2 {

    public static void main(String[] args) {
        List<String> enames = Arrays.asList("nithya", "Spoorthi", "Raju");

       
        List<String> upper = new ArrayList<>(enames.size());

        for (String name : enames) {
            upper.add(name.toUpperCase());
        }

        System.out.println(enames);
        System.out.println(upper);
    }
}
