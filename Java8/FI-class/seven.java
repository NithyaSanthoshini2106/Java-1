import java.util.function.Supplier;  
import java.util.List;
import java.util.Arrays;

public class seven{
    public static void main(String[] args) {
        Supplier<Integer> s1 = () -> 1000;
        Supplier<String> s2 = () -> "Nithya Spoorthi Nithya Raju";
        Supplier<Boolean> s3 = () -> 100 > 200;

        System.out.println(s1.get()); 
        System.out.println(s2.get()); 
        System.out.println(s3.get()); 
    }
}
