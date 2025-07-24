// File: Test.java

public class A {

    public int a = 1;      // public variable
    protected int b = 2;   // protected variable
    int c = 3;             // default (package-private) variable
    private int d = 4;     // private variable

    public void display() {
        System.out.println("Public variable: " + a);
        System.out.println("Protected variable: " + b);
        System.out.println("Default variable: " + c);
        System.out.println("Private variable: " + d);
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}
