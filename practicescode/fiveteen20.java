


interface Greeting {
    void sayHello(String name);
}
public class fiveteen20 {
    public static void main(String[] args) {
        Greeting g = (name) -> System.out.println(name);
        g.sayHello("Java");
    }
}
