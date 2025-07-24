import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Listarray8 {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Nithya", "Rajunithu", "Raju", "Kiran");
        List<String> forEachNames = new ArrayList<String>();
        for (String name : enames) {
            if (name.startsWith("R")) {
                forEachNames.add(name);
            }
        }
        System.out.println("Using for-each:");
        for (String name : forEachNames) {
            System.out.println(name);
        }
        List<String> iteratorNames = new ArrayList<String>();
        Iterator<String> it = enames.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.startsWith("R")) {
                iteratorNames.add(name);
            }
        }
        System.out.println("\nUsing Iterator:");
        Iterator<String> printIt = iteratorNames.iterator();
        while (printIt.hasNext()) {
            System.out.println(printIt.next());
        }
    }
}
