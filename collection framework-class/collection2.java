import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class collection2 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(70, 80, 18, 7));
        Iterator<Integer> it = numbers.iterator();
        System.out.println("Elements using while + Iterator:");
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(value);
        }
    }
}
