

// Java 8 Interface Examples
@FunctionalInterface
interface Calculator {
    int operation(int a, int b); // abstract method
}

interface Vehicle {
    void drive();   // abstract method

    // default method
    default void fuelType() {
        System.out.println("Default Fuel: Petrol");
    }

    // static method
    static void service() {
        System.out.println("Vehicle needs servicing...");
    }
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving smoothly...");
    }

    // override default method
    @Override
    public void fuelType() {
        System.out.println("Car Fuel: Diesel");
    }
}

public class seven {
    public static void main(String[] args) {

        // 1. Default & Static methods
        Vehicle v = new Car();
        v.drive();
        v.fuelType();
        Vehicle.service();

        System.out.println("-------------------------");

        // 2. Functional Interface + Lambda
        Calculator add = (a, b) -> a + b;
        Calculator mul = (a, b) -> a * b;

        System.out.println(add.operation(10, 5));
        System.out.println(mul.operation(10, 5));

        System.out.println("-------------------------");

        // 3. Method Reference with Functional Interface
        Calculator max = Integer::max;
        System.out.println(max.operation(15, 25));
    }
}
