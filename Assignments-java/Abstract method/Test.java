// Abstract class
abstract class A {

    // Inner class B
    static class B {}
}

// Main class
public class Test {

    public static void main(String[] args) {

        // Create object of inner class A.B
        A.B b = new A.B();
        System.out.println(b);

        // Cannot create object of abstract class A
        // new A();  // This line is invalid and will give error
    }
}
