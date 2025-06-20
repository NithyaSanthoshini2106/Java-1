abstract class Animal {
    abstract void sound(); // abstract method

    void eat() {
        System.out.println("This animal eats food."); // concrete method
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        myDog.sound();
        myDog.eat();
    }
}
