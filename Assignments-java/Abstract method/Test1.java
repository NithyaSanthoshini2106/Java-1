// Abstract class A
abstract class A {}

// Concrete class B
class B {

    public void login() {
        System.out.println("Login Success");
    }
}

// Main class
public class Test1 {
    public static void main(String[] args) {
        B b = new B();   
        b.login();       
    }
}
