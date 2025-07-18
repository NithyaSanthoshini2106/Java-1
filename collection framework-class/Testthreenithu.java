import java.util.Arrays;
import java.util.List;

public class Testthreenithu {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(43, 54, 87, 4, 6, 65, 786);

        int total = 0;
        for (Integer num:numbers) {
            total=total+num;
        }
        System.out.println("Sum of List of Values:"+total);
    }
}
