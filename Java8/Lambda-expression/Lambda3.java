import java.util.List;

public class Lambda3 {
    public static void main(String[] args) {
        List<String> names = List.of("Nithya Raju ", "Spoorthi Raju", "Raju");

        names.forEach(name -> System.out.println(name.toUpperCase()));
    }
}
