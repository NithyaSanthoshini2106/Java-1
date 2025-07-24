import java.util.List;

public class Lambda6 {
    public static void main(String[] args) {
        List<String> names = List.of("Nithya", "Spoorthi", "Raju","Nithu", "amma", "nannaraju");

        names.forEach(name -> System.out.println(name.toUpperCase()));
    }
}
