@FunctionalInterface
interface MyFunctional {
    void sayHello();  
}

public class Q2 {
    public static void main(String[] args) {
        MyFunctional f = () -> System.out.println("Hello from Functional Interface assignment!");
        f.sayHello();
    }
}
