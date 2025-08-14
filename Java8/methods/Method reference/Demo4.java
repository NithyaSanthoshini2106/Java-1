import java.util.function.Supplier;

class MyClass {
    MyClass() {
        System.out.println("Constructor called");
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Supplier<MyClass> supplier = MyClass::new;
        supplier.get(); 
    }
}
