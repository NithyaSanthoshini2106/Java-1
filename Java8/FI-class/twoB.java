import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class twoB {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nithya", "Spoorthi", "Vasavi", "Keerthi","Vasu Nithu Kittu");

       
        List<String> l1 = names.stream()
                                          .filter(name -> name.startsWith("R"))
                                          .collect(Collectors.toList());

        System.out.println(l1);
        System.out.println(names);
    }
}
