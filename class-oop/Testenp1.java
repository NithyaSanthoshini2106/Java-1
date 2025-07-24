class Employee {
    private int empId;        // private data
    private String empName;

    // Setter method for empId
    public void setEmpId(int id) {
        empId = id;
    }

    
    public int getEmpId() {
        return empId;
    }

   
    public void setEmpName(String name) {
        empName = name;
    }

    
    public String getEmpName() {
        return empName;
    }
}

public class Testenp1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(101);
        e.setEmpName("Nithya");

        System.out.println(e.getEmpId());
        System.out.println(e.getEmpName());
    }
}
