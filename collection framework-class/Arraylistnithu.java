import java.util.ArrayList;

public class Arraylistnithu {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nithya");
        names.add("Raju");
        names.add("Spoorthi");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
