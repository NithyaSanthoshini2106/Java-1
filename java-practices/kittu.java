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


public class kittu {
    public static void main(String[] args) {
        
        Car myCar = new Car();  // ← Object created

       
        myCar.brand = "Honda";
        myCar.year = 2022;

        
        System.out.println("Car Brand: " + myCar.brand);
        System.out.println("Model Year: " + myCar.year);
        myCar.startEngine();  
    }
}
