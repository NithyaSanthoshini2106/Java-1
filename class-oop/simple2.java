class Parent {
    int a;

    Parent(int a) {
        this.a = a;
        System.out.println("Parent class Constructor");
    }
}

class Child extends Parent {
    int b;

    Child() {
        super(10); // Call to Parent class constructor with a value
        this.b = 20;
        System.out.println("Child Class Constructor");
    }
}

public class simple2 {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("a: " + obj.a);
        System.out.println("b: " + obj.b);
    }
}
