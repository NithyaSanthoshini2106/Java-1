public class variableEx{

    int instanceVar = 10;
    static String staticVar = "Shared among all instances";

    public void display() {
        
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
