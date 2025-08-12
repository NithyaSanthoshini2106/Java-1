import java.util.Arrays;
import java.util.List;

public class API8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "python", "java", "c++");

        long count = words.stream()
                          .filter(w -> w.equals("java"))
                          .count();

        System.out.println("Java Count = " + count); 
    }
}
