import java.util.Optional;

public class sixkittu {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("NithyaSpoorthi");

        name.ifPresent(System.out::println); 
        System.out.println(name.orElse("Nithya Santhoshini")); 
    }
}
