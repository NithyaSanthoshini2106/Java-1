import java.util.Optional;

public class five {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Nithya");
        name.ifPresent(System.out::println);
        System.out.println(name.orElse("Default Name")); 
    }
}
