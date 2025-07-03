import java.util.ArrayList;
import java.util.Collections; 
import java.util.Scanner;

public class sort {
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
    }
}
