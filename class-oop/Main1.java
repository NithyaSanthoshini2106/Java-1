// Class with encapsulation
class Student {
    // Private data members - cannot be accessed directly
    private String name;
    private int age;

    // Public getter and setter methods - controlled access
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}

// Main class to use the encapsulated class
public class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        s1.setName("Nithya");
        s1.setAge(20);
        
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
