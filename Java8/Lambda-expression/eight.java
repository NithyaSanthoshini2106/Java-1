import java.util.Arrays;

public class eight {
    public static void main(String[] args) {
        Arrays.asList("a", "b", "c")
              .stream()
              .map(String::toUpperCase)
              .forEach(System.out::println);
    }
}
