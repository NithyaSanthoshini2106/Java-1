import java.util.LinkedList;

public class one {

    public static void main(String[] args) {
        LinkedList<String> enames = new LinkedList<String>();
        enames.add("Nithya");
        enames.add("Raju");
        enames.add("Spoorthi");
        enames.add("Modi");
        enames.add("Varma");

        for (String name : enames) {
            System.out.println(name);
        }
    }
}
