import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class collection3 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(70, 80, 18, 7));

        Iterator<Integer> it = numbers.iterator();

        System.out.println("Elements using do-while + Iterator:");
        
        if (it.hasNext()) {  
            do {
                Integer value = it.next();
                System.out.println(value);
            } while (it.hasNext());
        }
    }
}
