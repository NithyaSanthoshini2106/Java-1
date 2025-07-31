// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class fourteen5 {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 13) {
            throw new InvalidAgeException("Age must be 13 or above.");
        }
        System.out.println("Valid age.");
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
