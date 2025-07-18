import java.util.Arrays;
import java.util.List;

public class Test1nithu {

    public static void main(String[] args) {
      
        List<Integer> list = Arrays.asList(18, 31, 11, 8, 7, 55, 232, 18, 31);
        
        double avg = list.stream()
                         .mapToInt(e -> e)
                         .average()
                         .getAsDouble();

        System.out.println(avg);
    }

}
