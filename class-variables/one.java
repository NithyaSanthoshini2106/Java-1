

class VariablesExample {
    // Instance variable
    String name;

    // Static variable
    static String company = "Tech Solutions";

    // Constructor
    VariablesExample(String n) {
        name = n; // Local variable 'n' assigned to instance variable 'name'
    }

    // Method
    void displayDetails() {
        // Local variable
        int id = 101;
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
    }

    public static void main(String[] args) {
        VariablesExample obj1 = new VariablesExample("Nithya");
        VariablesExample obj2 = new VariablesExample("Spoorthi");

        obj1.displayDetails();
        obj2.displayDetails();

        // Access static variable directly using class name
        System.out.println(VariablesExample.company);
    }
}
