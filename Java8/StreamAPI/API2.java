import java.util.Arrays;
import java.util.List;

public class API2 {

    public static void main(String[] args) {
        List<String> enames = Arrays.asList("nithya", "Spoorthi", "Raju" , "Nithu" , "spoorthi");

     
        enames.replaceAll(String::toUpperCase);

        System.out.println(enames);
    }
}
