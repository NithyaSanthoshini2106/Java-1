import java.util.function.Consumer;

class Utility {
    static void printMessage(String msg) {
        System.out.println("Message: " + msg);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Consumer<String> c = Utility::printMessage;
        c.accept("Hello");  
    }
}
