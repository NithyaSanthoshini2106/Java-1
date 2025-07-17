import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class Listarray14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 43, 56, 78, 9, 98, 5);

        Optional<Integer> max = numbers.stream()
            .max(Integer::compareTo);
        if (max.isPresent()) {
            System.out.println(max.get());
        } else {
            System.out.println("List is empty.");
        }
    }
}

