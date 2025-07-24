public class nithu{
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
        nithu student1 = new nithu();
        student1.setDetails("Adluru Nithya Santhoshini", 25);
        student1.displayDetails();
    }
}
