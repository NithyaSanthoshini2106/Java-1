import java.util.LinkedList;
import java.util.Collections;

public class sortllone {
    public static void main(String[] args) {
        LinkedList<String> enames = new LinkedList<>();

        // Adding elements
        enames.add("Nithya");
        enames.add("Raju");
        enames.add("Spoorthi");
        enames.add("Modi");
        enames.add("Varma");

    
        System.out.println(enames);

      
        Collections.sort(enames);
        System.out.println(enames);

       
        Collections.reverse(enames);
        System.out.println(enames);
    }
}
