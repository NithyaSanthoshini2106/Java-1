import java.util.List;

public class Lambda5 {
    public static void main(String[] args) {
        List<String> names = List.of("Nithya", "Spoorthi", "Raju", "nithu");

        names.forEach(name -> System.out.println(name.toUpperCase()));
    }
}
