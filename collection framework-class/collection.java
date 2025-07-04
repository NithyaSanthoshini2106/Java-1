
import java.util.LinkedList;
import java.util.Iterator;

public class collection {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(70);
        numbers.add(80);
        numbers.add(18);
        numbers.add(7);

        // Create an Iterator
        Iterator<Integer> it = numbers.iterator();

        // Use Iterator to traverse
        System.out.println("Elements using Iterator:");
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(value);
        }
    }
}
