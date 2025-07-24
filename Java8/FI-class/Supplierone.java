import java.util.function.Supplier;

public class Supplierone {
    public static void main(String[] args) {

        
        Supplier<String> greet = () -> "Hello, Nithya";

        System.out.println(greet.get());  
    }
}
