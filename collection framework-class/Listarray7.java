import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Listarray7 {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Nithya", "Rajunithu", "Raju", "Kiran");

        List<String> new_names = new ArrayList<String>();
        for (String name : enames) {
            if (name.startsWith("R")) {
                new_names.add(name);
            }
        }

    
        System.out.println("Names starting with R:");
        for (String name : new_names) {
            System.out.println(name);
        }
    }
}
