class Parent{
    Parent(){
        System.out.println("Parent class Constructor");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child Class Constructor");
    }
}
public class Demoa {
    public static void main(String[] args) {
        new Child();
    }
}