public class instance {
    // Instance variables
    String color;
    int year;

    
    public instance(String instanceColor, int instanceYear) {
        color = instanceColor;
        year = instanceYear;
    }

    // Method
    public void displayDetails() {
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        
        instance car1 = new instance("Red", 2020);
        instance car2 = new instance("Blue", 2021);

    
        car1.displayDetails();
        car2.displayDetails();
    }
}

