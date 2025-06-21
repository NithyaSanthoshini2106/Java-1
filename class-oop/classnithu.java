// Class definition
class Student {
    // Properties / Fields
    int studentId;
    String studentName;
    int studentAge;

    // Method to display student info
    void displayInfo() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
    }
}

// Main class
public class classnithu {
    public static void main(String[] args) {
        // Creating objects of the Student class
        Student s1 = new Student();
        s1.studentId = 101;
        s1.studentName = "Nithya";
        s1.studentAge = 20;

        Student s2 = new Student();
        s2.studentId = 102;
        s2.studentName = "Spoorthi";
        s2.studentAge = 21;

        // Calling method to display student information
        s1.displayInfo();
        System.out.println("------------");
        s2.displayInfo();
    }
}
