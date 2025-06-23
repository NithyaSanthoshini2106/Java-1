// Abstraction using abstract class
abstract class Animal {
    // Abstract method
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Inheritance: Dog inherits Animal
class Dog extends Animal {
    // Polymorphism: method overridden
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class to show polymorphism
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Encapsulation: private data with getters/setters
class Person {
    private String name;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        // Encapsulation
        Person p = new Person();
        p.setName("John");
        System.out.println("Person name: " + p.getName());

        // Polymorphism using parent reference
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();  // Output: Dog barks
        a2.sound();  // Output: Cat meows

        a1.sleep();  // Output: Animal is sleeping...
    }
}
