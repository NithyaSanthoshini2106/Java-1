import java.util.Optional;

public class NPE3 {
    public static void main(String[] args) {
        String name = null;
        Optional<String> optionalName = Optional.ofNullable(name);

        System.out.println("Length: " + optionalName.map(String::length).orElse(0));
    }
}
