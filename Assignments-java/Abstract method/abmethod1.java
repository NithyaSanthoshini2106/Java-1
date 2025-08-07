// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Concrete method (with body)
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (provides implementation of abstract method)
class Cat extends Animal {
    // Implement abstract method
    void sound() {
        System.out.println("Cat barks.");
    }
}

public class abmethod1 {
    public static void main(String[] args) {
        Cat d = new Cat();
        d.sound();  
        d.eat();    
    }
}
