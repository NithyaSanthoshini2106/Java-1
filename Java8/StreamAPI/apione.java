import java.util.*;
import java.util.stream.Collectors;

public class apione {
    public static void main(String[] args) {

        List<List<String>> nestedList = Arrays.asList(
            Arrays.asList("Java", "Python"),
            Arrays.asList("Java", "C++"),
            Arrays.asList("Python", "JavaScript")
        );

        List<Integer> numbers = Arrays.asList(5, 3, 8, 3, 9, 1, 8, 2);

        // 1. flatMap - Flatten nested lists
        System.out.println("Flattened List:");
        List<String> flatList = nestedList.stream()
                                          .flatMap(List::stream)
                                          .collect(Collectors.toList());
        System.out.println(flatList);

        // 2. distinct - Remove duplicates
        System.out.println("\nDistinct Languages:");
        flatList.stream()
                .distinct()
                .forEach(System.out::println);
        int maxNum = numbers.stream().max(Integer::compareTo).orElse(-1);
        int minNum = numbers.stream().min(Integer::compareTo).orElse(-1);
        System.out.println("\nMax Number: " + maxNum);
        System.out.println("Min Number: " + minNum);
        boolean hasJava = flatList.stream().anyMatch(lang -> lang.equalsIgnoreCase("Java"));
        boolean allLongerThanTwo = flatList.stream().allMatch(lang -> lang.length() > 2);
        boolean noneRuby = flatList.stream().noneMatch(lang -> lang.equalsIgnoreCase("Ruby"));

        System.out.println("\nContains 'Java'? " + hasJava);
        System.out.println("All names longer than 2 chars? " + allLongerThanTwo);
        System.out.println("No 'Ruby'? " + noneRuby);
        String joinedLanguages = flatList.stream()
                                         .distinct()
                                         .collect(Collectors.joining(", "));
        System.out.println("\nJoined Languages: " + joinedLanguages);
    }
}
