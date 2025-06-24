// Define a class
class Student {
    String name;
    int age;

    // Method to display info
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Stringobject {
    public static void main(String[] args) {
        // Create object of Student class
        Student s1 = new Student();   // ← Object created here
        s1.name = "Nithya";
        s1.age = 21;

        // Call method using object
        s1.display();
    }
}
