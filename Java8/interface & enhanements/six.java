


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

public class six {
    public static void main(String[] args) {
        Calculator max = Integer::max;
        System.out.println(max.operation(15, 25));
    }
}
