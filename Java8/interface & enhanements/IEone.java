interface Greeter {
    void sayHello(String name);

    default void sayHi() {
        System.out.println("Hi i am nithya spoorthi");
    }
}

class Friendly implements Greeter {
    @Override
    public void sayHello(String name) {
        System.out.println(name);
    }
}

public class IEone {          
    public static void main(String[] args) {
        Greeter g = new Friendly();
        g.sayHello("Nithya");
        g.sayHi();          
    }
}
