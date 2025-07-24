// Abstraction
abstract class Shape {
    abstract void area(); // abstract method
}

// Inheritance
class Rectangle extends Shape {
    private int length;   // Encapsulation: private data
    private int width;

    // Encapsulation: public setters
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Abstraction: implementing abstract method
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

// Another class to show Inheritance
class Square extends Shape {
    private int side;   // Encapsulation: private variable

    public void setSide(int side) {
        this.side = side;
    }

    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(5);
        r.area(); // Output: Area of Rectangle: 50

        Square s = new Square();
        s.setSide(6);
        s.area(); // Output: Area of Square: 36
    }
}
