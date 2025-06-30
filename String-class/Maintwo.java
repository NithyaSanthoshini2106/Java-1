public class Maintwo {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be 18 or older.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        checkAge(16);  
    }
}
