class Employee {
    private String name;
    
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class coded {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Alice");
        System.out.println("Employee Name: " + emp.getName());
    }
}
