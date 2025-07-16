
import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "api");

        list.forEach(String::toUpperCase); 
        list.forEach(System.out::println); 
    }
}

    

