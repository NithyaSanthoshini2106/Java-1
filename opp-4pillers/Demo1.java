
abstract class Animal {
    abstract void makeSound(); 
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}


class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}


class Person {
    private String name; 

    public void setName(String name) { 
        this.name = name;
    }

    public String getName() { 
        return name;
    }
}

public class Demo1 {
    public static void main(String[] args) {

        
        Person p1 = new Person();
        p1.setName("Nithya");
        System.out.println("Encapsulation: Name is " + p1.getName());

        
        Animal a1 = new Dog(); 
        Animal a2 = new Cat(); 

        System.out.print("Polymorphism: ");
        a1.makeSound(); 

        System.out.print("Polymorphism: ");
        a2.makeSound(); 
    }
}

