interface Vehicle {
    void drive(); 
    default void fuelType() {
        System.out.println("Uses Petrol or Diesel");
    }
    static void service() {
        System.out.println("Vehicle needs servicing");
    }
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving...");
    }
}

public class one {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();         
        c.fuelType();     
        Vehicle.service();
    }
}
