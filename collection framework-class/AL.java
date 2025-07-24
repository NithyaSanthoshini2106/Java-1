import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AL {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(23, 45, 5, 6, 8, 987);

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers  = new ArrayList<>();

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }
}
