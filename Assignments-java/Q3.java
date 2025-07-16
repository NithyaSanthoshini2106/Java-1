import java.util.Optional;

public class Q3 {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java Full Stack NithyaSpoorthi");
        Optional<String> emptyName = Optional.ofNullable(null);
        System.out.println(name.orElse("Name"));
        System.out.println(emptyName.isPresent());
        name.ifPresent(n -> System.out.println(n));
    }
}
