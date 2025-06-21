// Class definition
class Car {
    // Properties / Fields
    String brand;
    int modelYear;

    // Method
    void startEngine() {
        System.out.println(brand + " engine started.");
    }
}

// Main class to create and use objects
public class objectnithu {
    public static void main(String[] args) {
        // Creating first object
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.modelYear = 2020;
        car1.startEngine();  // Output: Toyota engine started.

        // Creating second object
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.modelYear = 2022;
        car2.startEngine();  // Output: Honda engine started.

        // Display details
        System.out.println("Car 1: " + car1.brand + " - " + car1.modelYear);
        System.out.println("Car 2: " + car2.brand + " - " + car2.modelYear);
    }
}
