class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("The car is driving at " + speed + " km/h");
    }
}

public class ten3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.speed = 80;
        myCar.drive();
    }
}
