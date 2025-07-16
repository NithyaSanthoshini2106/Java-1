


import java.util.function.Consumer;

public class one {
    static void m1(String msg) {
        System.out.println("Message: " + msg);
    }
}

class Demo {
    public static void main(String[] args) {
        Consumer<String> c = one::m1;
        c.accept("Hello");  
    }
}
