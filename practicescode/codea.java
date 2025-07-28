abstract class Shape {
    abstract void draw();  // abstract method

    void display() {
        System.out.println("Displaying shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class codea{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.display();
    }
}
