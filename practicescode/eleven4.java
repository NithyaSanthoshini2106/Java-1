abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class eleven4 {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}
