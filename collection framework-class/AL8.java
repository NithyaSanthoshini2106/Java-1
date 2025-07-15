import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class AL8 {

    public static void main(String[] args) {
        List<String> enames = Arrays.asList("nithya", "Spoorthi", "Raju");
        List<String> new_enames = new ArrayList<>();

        for (String ename : enames) {
            new_enames.add(ename.toUpperCase()); 
        }

        System.out.println(enames);
        System.out.println(new_enames);
    }
}
