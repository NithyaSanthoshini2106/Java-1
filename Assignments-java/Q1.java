import java.util.*;
import java.time.*;
import java.util.Optional;

@FunctionalInterface
interface MyFunctional {
    void greet();
}

public class Q1 {
    public static void main(String[] args) {
        MyFunctional f = () -> System.out.println("Hello from assignment!");
        f.greet();
        List<String> list = Arrays.asList("Apple", "Banana", "Mango");
        list.stream()
            .filter(s -> s.startsWith("A"))
            .forEach(System.out::println); 
        System.out.println(LocalDate.now());
        Optional<String> name = Optional.ofNullable("Java Full Stack");
        System.out.println(name.orElse("No value"));
    }
}

