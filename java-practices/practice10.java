import java.util.*;

public class practice10 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20); 

        System.out.println("Sorted unique elements:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
