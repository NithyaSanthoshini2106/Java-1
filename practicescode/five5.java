public class five5 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
