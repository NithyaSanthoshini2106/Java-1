import java.util.*;

public class CollectionB {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nithya Raju");
        names.add("Spoorthi Raju");
        names.add("Kiran Raju");

        System.out.println("Names in ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
