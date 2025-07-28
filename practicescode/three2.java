
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class three2 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  
        Dog myDog = new Dog();          

        myAnimal.sound();
        myDog.sound();   
    }
}
