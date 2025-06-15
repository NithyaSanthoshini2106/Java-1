// Class definition
class Car {
    // Fields (attributes)
    String brand;
    int year;

    // Method (behavior)
    void startEngine() {
        System.out.println(brand + " engine started.");
    }
}

// Main class with main method
public class varma {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car();  // ← Object created

        // Assigning values to object fields
        myCar.brand = "Honda";
        myCar.year = 2025;

        // Accessing object data and calling methods
        System.out.println("Car Brand: " + myCar.brand);
        System.out.println("Model Year: " + myCar.year);
        myCar.startEngine();  // Calling method using object
    }
}
