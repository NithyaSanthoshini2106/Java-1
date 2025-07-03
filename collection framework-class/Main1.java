import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Nithya");
        enames.add("Raju");
        enames.add("Spoorthi");
        enames.add("Modi");
        enames.add("Varma");

        System.out.println(enames.size());
        System.out.println(enames.isEmpty());
        System.out.println(enames.contains("Nithya"));
    }
}
