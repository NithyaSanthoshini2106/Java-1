@FunctionalInterface
interface MyInterface {
    void show();  
}

public class Q10 {
    static void display() {
        System.out.println("Hello from method reference!");
    }

    public static void main(String[] args) {
        MyInterface ref = Q10::display;
        ref.show();  

    }
}