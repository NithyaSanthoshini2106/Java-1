@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Lambda {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello from Lambda!");
        g.sayHello(); 
    }
}
