interface A {
    default void ping() { System.out.println("A"); }
}
interface B {
    default void ping() { System.out.println("B"); }
}
class C implements A, B {
   
    @Override public void ping() {
        A.super.ping();     
    }
}

public class IEfour {
    public static void main(String[] args) {
        new C().ping();     
    }
}
