import java.util.List;
import java.util.Arrays;
import java.util.ArrayList; 

public class AL2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 34, 44, 66, 77, 7, 6);
        System.out.println("All Numbers: " + numbers);

        ArrayList<Integer> even_numbers = new ArrayList<>();
        List<Integer> odd_numbers = new ArrayList<>();

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                even_numbers.add(num);
            } else {
                odd_numbers.add(num); 
            }
        }

        System.out.println(even_numbers);
        System.out.println(odd_numbers);
    }
}
