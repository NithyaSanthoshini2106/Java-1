import java.util.*;

public class Collectionone {
    public static void main(String[] args) {
        
        
        List<String> names = new ArrayList<>();
        names.add("Nithya");
        names.add("Raju");
        names.add("Spoorthi");
        names.add("Nithu Raju"); 

        System.out.println("List:");
        for(String name : names) {
            System.out.println(name);
        }

        
    }
}
