// Abstract class A
abstract class A {}

// Abstract class B
abstract class B {
    public void login() {
        System.out.println("Login Success");
    }

    public abstract void forget_PWD();  
}

// Class C extends B
class C extends B {
    public void forget_PWD() {  
        System.out.println("Check Mail");
    }
}

// Main class
class Testone {
    public static void main(String[] args) {
        C obj = new C();
        obj.login();         
        obj.forget_PWD();    
    }
}
