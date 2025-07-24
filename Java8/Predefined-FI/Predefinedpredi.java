import java.util.function.Predicate;
import java.util.List;

public class Predefinedpredi{
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;             

        List.of(3, 4, 6).stream()
                        .filter(isEven)
                        .forEach(System.out::println); 
   }
}

    
