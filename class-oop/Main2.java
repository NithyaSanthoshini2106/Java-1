
abstract class Shape {
    
    abstract void draw();

    // Non-abstract method
    public void display() {
        System.out.println("Displaying the shape");
    }
}

// Concrete class inheriting the abstract class
class Circle extends Shape {
    // Implementing the abstract method
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Main class
public class Main2 {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Polymorphism
        shape.draw();   // Calls Circle's draw method
        shape.display(); // Calls base class method
    }
}
