public class types {
    // Instance variable
    int A = 10;

    // Static variable
    static String B = " I am a static variable ";

    public void displayVariables() {
        // Local variable
        double C = 3.14;

        System.out.println("Instance Variable: " + A);
        System.out.println("Static Variable: " + B);
        System.out.println("Local Variable: " + C);
    }

    public static void main(String[] args) {
        types example = new types();
        example.displayVariables();
    }
}
