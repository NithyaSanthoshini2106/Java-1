import java.util.*;

public class CollectionA {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nithya");
        names.add("Spoorthi");
        names.add("Raju");

        System.out.println("Names in ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
