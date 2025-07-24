class Parent{
    int a;
    Parent(int a){
        this.a=a;
        System.out.println("Parent class Constructor");
    }
}
class Child extends Parent{
    int b;
    Child(int a, int b){
        super(a);
        this.b=b;
        System.out.println("Child Class Constructor");
    }
}
public class Demovasu4 {
    public static void main(String[] args) {
       Child obj=new Child(10,20);
       System.out.println(obj.a);
       System.out.println(obj.b);
    }
}