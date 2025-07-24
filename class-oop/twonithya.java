// Parent class (Super class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class twonithya{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited method
        d.bark();  // Own method
    }
}
