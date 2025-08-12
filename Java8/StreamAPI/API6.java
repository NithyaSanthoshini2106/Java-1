import java.util.Arrays;
import java.util.List;

public class API6 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 10, 15);

        int sum = nums.stream()
                      .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
