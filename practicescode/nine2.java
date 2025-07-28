class Car {
    String model;
    int year;

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class nine2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Honda City";
        myCar.year = 2022;
        myCar.display();
    }
}
