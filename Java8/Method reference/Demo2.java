import java.util.function.Consumer;

public class Demo2 {
    void greet(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2(); 
        Consumer<String> c = d::greet;
        c.accept("Nithya");  
    }
}
