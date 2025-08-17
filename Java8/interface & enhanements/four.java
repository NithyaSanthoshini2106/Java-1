

@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

interface Vehicle {
    void drive(); 
    default void fuelType() {
        System.out.println("Default Fuel: Petrol");
    }
    static void service() {
        System.out.println("Vehicle needs servicing...");
    }
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving smoothly...");
    }
    @Override
    public void fuelType() {
        System.out.println("Car Fuel: Diesel");
    }
}

public class four {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();
        v.fuelType();
        Vehicle.service();

        System.out.println("-------------------------");
    }
}
