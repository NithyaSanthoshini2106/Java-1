@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello();
}

public class Q8 {
    static void greet() {
        System.out.println("Hello from method reference!");
    }

    public static void main(String[] args) {
        MyFunctionalInterface f = Q8::greet; 
        f.sayHello(); 
    }
}
