class Car {
    String brand;
    int year;

    Car(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println(brand +  year);
    }
}

public class ten14 {
    public static void main(String[] args) {
        Car c1 = new Car("Nithyaspoorthi", 2025);
        c1.display();
    }
}
