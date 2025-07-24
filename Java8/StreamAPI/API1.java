import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class API1 {

    public static void main(String[] args) {
        List<String> enames = Arrays.asList("nithya", "Spoorthi", "Raju Nithu");

        List<String> upper = enames.stream()          
                                   .map(String::toUpperCase) 
                                   .collect(Collectors.toList()); 

        System.out.println(enames);
        System.out.println(upper);
    }
}
