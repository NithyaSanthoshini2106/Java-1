import java.util.*;
import java.util.stream.*;

public class Q13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        System.out.println("Using limit(3):");
        numbers.stream()
               .limit(3)  
               .forEach(System.out::println);

        System.out.println("\nUsing skip(3):");
        numbers.stream()
               .skip(3)   
               .forEach(System.out::println);

        System.out.println("\nUsing skip(2) and limit(3):");
        numbers.stream()
               .skip(2)  
               .limit(3)  
               .forEach(System.out::println);
    }
}
