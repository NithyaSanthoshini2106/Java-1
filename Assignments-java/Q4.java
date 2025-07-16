interface MyInterface {
    default void show() {
        System.out.println("This is a default method in an interface");
    }
}
public class Q4 implements MyInterface {
    public static void main(String[] args) {
        Q4 obj = new Q4();
        obj.show(); 
    }
}
