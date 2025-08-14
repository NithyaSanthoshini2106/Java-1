import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        Arrays.asList("3", "1", "4")
              .stream()
              .map(Integer::parseInt)  // static method reference
              .forEach(System.out::println);
    }
}
