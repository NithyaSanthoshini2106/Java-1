import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Listarray9 {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Nithya", "Rajunithu", "Raju", "Kiran");

        List<String> new_names = enames.stream()
            .filter(ename -> ename.startsWith("R"))
            .collect(Collectors.toList());
        System.out.println(new_names);
    
        
    }
}
