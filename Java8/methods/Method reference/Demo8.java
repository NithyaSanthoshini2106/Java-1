import java.util.Arrays;

public class Demo8 {
    public static void main(String[] args) {
        Arrays.asList("banana", "apple", "cherry")
              .stream()
              .sorted(String::compareToIgnoreCase) // instance method ref
              .forEach(System.out::println);
    }
}
