import java.util.ArrayList;
import java.util.Collections;

public class Sort1 {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<>();
        enames.add("Nithya");
        enames.add("Raju");
        enames.add("Spoorthi");
        enames.add("Modi");
        enames.add("Varma");

        System.out.println(enames);
        Collections.sort(enames);
        System.out.println(enames);

        
        Collections.sort(enames, Collections.reverseOrder());
        System.out.println(enames);
    }
}
