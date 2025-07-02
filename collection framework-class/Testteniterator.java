import java.util.ArrayList;
import java.util.Iterator;

public class Testteniterator {
    public static void main(String[] args) {
        
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Nithya Spoorthi");
        enames.add("Kiran Raju");
        enames.add("Priya");
        enames.add("Modi");
        enames.add("Krishna Vamsi");

        
        System.out.println("Employee names using Iterator:");
        Iterator<String> it = enames.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}
