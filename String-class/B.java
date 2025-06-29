public class B {
    public static void main(String[] args) {
        // Creating strings
        String name = "Nithya Spoorthi";
        String greeting = "Hello Nithya";

        // Concatenation
        String message = greeting + ", " + name + "!";

        // Length of the string
        int length = message.length();

        // Convert to uppercase
        String upper = message.toUpperCase();

        // Check if it contains a word
        boolean containsHello = message.contains("Hello");

        // Print results
        System.out.println(message);
        System.out.println(length);
        System.out.println(upper);
        System.out.println(containsHello);
    }
}
