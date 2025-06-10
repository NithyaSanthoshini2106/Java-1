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
class Dog extends Animal {
    // Implement abstract method
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class abmethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  
        d.eat();    
    }
}
