import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class fiveA {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "apricot", "banana", "blueberry",
                "cherry", "cantaloupe", "avocado", "blackberry"
        );
        Map<Character, Long> countsByFirstLetter = words.stream()
                .collect(Collectors.groupingBy(
                        word -> word.charAt(0),      
                        Collectors.counting()         
                ));

        countsByFirstLetter.forEach(
                (letter, count) -> System.out.println(letter + " : " + count)
        );
        System.out.println(words);
    }
}
