
public class Nithya {
    // Instance variables
    String name;
    int age;

    // Static variable
    static String schoolName = "Greenwood High";

    public void setDetails(String studentName, int studentAge) {
        // Local variables
        name = studentName;
        age = studentAge;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School: " + schoolName);
    }

    public static void main(String[] args) {
        Nithya student1 = new Nithya();
        student1.setDetails("NIthuya Raju", 24);
        student1.displayDetails();
    }
}
