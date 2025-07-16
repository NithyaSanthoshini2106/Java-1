@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Q5 {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello from Lambda Function!");
        g.sayHello();
    }
}
