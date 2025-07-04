import java.util.LinkedList;
import java.util.Iterator;

public class collection5 {
    public static void main(String[] args) {
      
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(70);
        numbers.add(80);
        numbers.add(18);
        numbers.add(7);

     
        Iterator<Integer> it = numbers.iterator();

       
        System.out.println("Elements using Iterator:");
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(value);
        }
    }
}
