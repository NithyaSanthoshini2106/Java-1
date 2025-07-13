@FunctionalInterface
interface funcation_one {
    void sayHello();
}

public class Mainone {
    public static void main(String[] args) {
        funcation_one greeting = () -> System.out.println("Hello from Functional Interface!");

        greeting.sayHello(); 
    }
}
