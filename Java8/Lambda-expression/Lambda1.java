@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Lambda1 {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello i am nithya from Lambda expression practice!");
        g.sayHello(); 
    }
}
