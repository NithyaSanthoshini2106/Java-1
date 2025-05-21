public class variableEx{
    // Instance variable
    int instanceVar = 10;

    // Class (static) variable
    static String staticVar = "Shared among all instances";

    public void display() {
        // Local variable
        double localVar = 5.5;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        variableEx obj = new variableEx();
        obj.display();
    }
}
