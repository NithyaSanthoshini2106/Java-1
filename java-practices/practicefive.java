import java.util.*;

public class practicefive {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(45, 12, 78, 34, 89, 23));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Min: " + min + ", Max: " + max);
        Collections.shuffle(numbers);
        System.out.println(numbers);
    }
}
