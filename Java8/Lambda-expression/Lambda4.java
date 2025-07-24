import java.util.List;

public class Lambda4{
    public static void main(String[] args) {
        List<String> names = List.of("Nithya", "Spoorthi", "Raju");

        names.forEach(name -> System.out.println(name.toUpperCase()));
    }
}
