import java.util.Arrays;

public class nine {
    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4, 5)
              .stream()
              .filter(n -> n % 2 == 0)
              .forEach(System.out::println); 
    }
}
