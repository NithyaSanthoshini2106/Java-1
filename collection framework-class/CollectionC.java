import java.util.*;

public class CollectionC {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Gopal Raju");
        names.add("Padhamaja Raju");
        names.add("Varma Raju");
        names.add("NithyaSanthoshini");

        System.out.println("Names in ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
