// Abstract class
abstract class Vehicle {
    // Abstract method (no body)
    abstract void start();
}

// Subclass
class Car extends Vehicle {
    // Implement abstract method
    void start() {
        System.out.println("Car is starting...");
    }
}

public class abone {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}
