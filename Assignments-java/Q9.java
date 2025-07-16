@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Q9 {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello!"); 
        g.sayHello();
    }
}
