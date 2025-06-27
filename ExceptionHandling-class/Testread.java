public class Testread {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}