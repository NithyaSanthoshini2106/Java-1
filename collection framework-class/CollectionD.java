import java.util.*;

public class CollectionD {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(101);
        numbers.add(102);
        numbers.add(101); // duplicate, won't be added

        System.out.println("Numbers in HashSet:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
