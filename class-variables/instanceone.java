public class instanceone {
    // Instance variables
    String BirthdayDates;
    int year;

    
    public instanceone(String instanceoneBirthdayDates, int instanceoneYear) {
        BirthdayDates = instanceoneBirthdayDates;
        year = instanceoneYear;
    }

    // Method
    public void displayDetails() {
        System.out.println("BirthdayDates: " + BirthdayDates);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        
        instanceone car1 = new instanceone("21/06/2004", 2024);
        instanceone car2 = new instanceone("15/03/1996", 2025);

    
        car1.displayDetails();
        car2.displayDetails();
    }
}
