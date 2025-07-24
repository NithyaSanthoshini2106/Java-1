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
    }
}

public class Testnithu {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.m1(); 
        obj.m2(); 
        obj.m3(); 
    }
}
