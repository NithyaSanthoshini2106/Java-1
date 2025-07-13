interface Greeting {
    void sayHello();
}

public class onekittu {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello from kittu nithu vasu!");
        g.sayHello();
    }
}
