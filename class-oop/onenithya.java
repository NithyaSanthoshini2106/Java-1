// Class with private data and public getters/setters
class Employee {
    // Private data members (cannot be accessed directly)
    private int empId;
    private String empName;

    // Setter methods (write access)
    public void setEmpId(int id) {
        empId = id;
    }

    public void setEmpName(String name) {
        empName = name;
    }

    // Getter methods (read access)
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

// Main class
public class onenithya{
    public static void main(String[] args) {
        Employee e1 = new Employee();

        // Setting values using setter methods
        e1.setEmpId(1001);
        e1.setEmpName("Nithya Spoorthi");

        // Getting values using getter methods
        System.out.println("Employee ID: " + e1.getEmpId());
        System.out.println("Employee Name: " + e1.getEmpName());
    }
}
