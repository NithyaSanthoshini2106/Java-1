
class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Employee constructor called");
    }

    void showDetails() {
        System.out.println(name);
        System.out.println(id);
    }
}
public class Manager1 extends Employee {
    String department;
    Manager1(String name, int id, String department) {
        super(name, id);  
        this.department = department;
        System.out.println("Manager constructor called");
    }

    void showManagerDetails() {
        showDetails(); 
        System.out.println( department);
    }

    public static void main(String[] args) {
        Manager1 m1 = new Manager1("Nithya raju ", 101, "HR");
        m1.showManagerDetails();
    }
}
