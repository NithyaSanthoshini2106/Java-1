import java.util.function.Supplier;
import java.time.LocalTime;

public class Predefinedsup {
    public static void main(String[] args) {
        Supplier<String> timeStamp = () -> LocalTime.now().toString();     

        System.out.println(timeStamp.get());
        System.out.println(timeStamp.get()); 
    }
}
