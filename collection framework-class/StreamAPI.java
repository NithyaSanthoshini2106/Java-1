import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        List<String> enames = Arrays.asList("nithya", "Spoorthi", "Rju");

        List<String> upper = enames.stream()          
                                   .map(String::toUpperCase) 
                                   .collect(Collectors.toList()); 
        System.out.println(enames);
        System.out.println( upper);
    }
}
