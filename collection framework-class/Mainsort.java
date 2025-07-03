import java.util.ArrayList;
import java.util.Collections;

public class Mainsort {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<>();
        enames.add("Nithya");
        enames.add("Raju");
        enames.add("Spoorthi");
        enames.add("Modi");
        enames.add("Varma");

        
        Collections.sort(enames);

        
        System.out.println("Sorted Names:");
        for (String name : enames) {
            System.out.println(name);
        }
    }
}
