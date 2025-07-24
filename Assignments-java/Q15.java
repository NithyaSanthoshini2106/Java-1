import java.util.*;
import java.util.stream.*;

public class Q15 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ADLU NITHYA", "KIRAN RAJU", "GOPAL RAJU", "PADHAMAJA RAJU", "VARMA RAJU");

        names.stream()
            .limit(3)
            .forEach(System.out::println);
    }
}
