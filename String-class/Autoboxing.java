class Emp {
    int empId = 101;
    String empName = "Nithya";

    @Override
    public String toString() {
        return "Emp ID: " + empId + ", Name: " + empName;
    }
}

public class Autoboxing {

    public static void main(String[] args) {
        
        Emp e = new Emp();

       
        int a = 100;
        Integer b = a;  

        System.out.println( b);
        System.out.println( e);
    }
}
