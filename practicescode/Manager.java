// Superclass
class Employee {
    String name;
    int id;

    // Constructor for Employee
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Employee constructor called");
    }

    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// Subclass
public class Manager extends Employee {
    String department;

    // Constructor for Manager
    Manager(String name, int id, String department) {
        super(name, id);  // Calls Employee constructor
        this.department = department;
        System.out.println("Manager constructor called");
    }

    void showManagerDetails() {
        showDetails();  // Calls Employee method
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("Nithya", 101, "HR");
        m1.showManagerDetails();
    }
}
