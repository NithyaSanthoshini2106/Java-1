public class practice11 {
    public static void main(String[] args) {
        String name = "Nithya";
        String greeting = "Hello";
        String message = greeting + " " + name;
        System.out.println("Message: " + message);
        System.out.println("Length of name: " + name.length());
        System.out.println("First 3 letters of name: " + name.substring(0, 3));
        String name2 = "nithya";
        System.out.println("Equals: " + name.equals(name2)); // case-sensitive
        System.out.println("Equals Ignore Case: " + name.equalsIgnoreCase(name2));
        System.out.println("Character at index 2: " + name.charAt(2));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Replace 'ya' with 'u': " + name.replace("ya", "u"));
        System.out.println("Contains 'thy': " + name.contains("thy"));
    }
}
