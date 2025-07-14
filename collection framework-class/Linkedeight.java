import java.util.LinkedHashSet;
import java.util.Iterator;

public class Linkedeight {

    public static void main(String[] args) {
        LinkedHashSet<Object> hs = new LinkedHashSet<>(20, 0.5f);
        hs.add(101);
        hs.add("Nithya");
        hs.add(101);                   // duplicate, ignored
        hs.add(102);
        hs.add(456098.77777f);
        hs.add("Null");

        // Use Iterator to iterate
        Iterator<Object> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
