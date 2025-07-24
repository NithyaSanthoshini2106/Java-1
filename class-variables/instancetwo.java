public class instancetwo {
    // Instance variables
    String BirthdayDates;
    int year;

    
    public instancetwo(String instancetwoBirthdayDates, int instancetwoYear) {
        BirthdayDates = instancetwoBirthdayDates;
        year = instancetwoYear;
    }

    // Method
    public void displayDetails() {
        System.out.println("BirthdayDates: " + BirthdayDates);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        
        instancetwo car1 = new instancetwo("21/06/2004", 2025);
        instancetwo car2 = new instancetwo("15/03/1996", 2025);

    
        car1.displayDetails();
        car2.displayDetails();
    }
}
