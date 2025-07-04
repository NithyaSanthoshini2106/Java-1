import java.util.LinkedList;
import java.util.Arrays;

public class collection4 {
    public static void main(String[] args) {
   
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(70, 80, 18, 7));

        
        System.out.println("Elements using for-each loop:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
