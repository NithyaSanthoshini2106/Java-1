class Parent {
    public void m1() {
        System.out.println("Parent class m1 method");
    }

    public void m2() {
        System.err.println("Parent class m2 method");
    }
}

class Child extends Parent {
    public void m3() {
        System.out.println("Child class m3 method");
        m4();  // Calling another method from same Child class
    }

    public void m4() {
        System.out.println("Child class m4 method");
    }
}

public class Testnithu1 {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.m1();  // From Parent
        obj.m2();  // From Parent
        obj.m3();  // From Child, and it will call m4() internally
    }
}
