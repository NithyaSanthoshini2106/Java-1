import java.util.*;

public class four1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(numbers, Collections.reverseOrder()); 
        System.out.println(numbers);

        List<String> names = Arrays.asList("Raju" ,"Adluru nithu", "Nithya", "Killiraju");
        Collections.sort(names);
        System.out.println(names);
    }
}
