import java.util.ArrayList;

public class Main5 {

    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Nithya");
        enames.add("Raju");
        enames.add("Spoorthi");
        enames.add("Modi");
        enames.add("Varma");

        for (String name : enames) {
            System.out.println(name);
        }
        System.out.println(enames.size());
        System.out.println(enames.isEmpty());
        System.out.println(enames.contains("Nithya"));
        System.out.println(enames.containsAll(enames));
        enames.set(1,"Nithya");
        System.out.println(enames);

        enames.remove(enames);
        enames.removeAll(enames);
        System.out.println(enames);

    }
}
