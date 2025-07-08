@FunctionalInterface
interface funcation_one {
    void sayHello();
}

public class Mainone {
    public static void main(String[] args) {
        // Using lambda expression to implement the interface
        Mainone greeting = () -> System.out.println("Hello from Functional Interface!");

        greeting.sayHello(); // Output: Hello from Functional Interface!
    }
}
