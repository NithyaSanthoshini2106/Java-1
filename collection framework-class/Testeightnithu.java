import java.util.*;
import java.util.stream.Collectors;

public class Testeightnithu {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(18, 31, 11, 8, 7, 55, 232, 18, 31);

        List<Integer> uniqueList = numbers.stream()
            .distinct()
            .collect(Collectors.toList());

        System.out.println(uniqueList);
    }
}
