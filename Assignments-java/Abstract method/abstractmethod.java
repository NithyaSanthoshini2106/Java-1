// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Concrete method (with body)
    void display() {
        System.out.println("Displaying the shape.");
    }
}

// Subclass 1
class Circle extends Shape {
    // Implement abstract method
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Subclass 2
class Rectangle extends Shape {
    // Implement abstract method
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class abstractmethod {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.display();

        Rectangle r = new Rectangle();
        r.draw();
        r.display();
    }
}
