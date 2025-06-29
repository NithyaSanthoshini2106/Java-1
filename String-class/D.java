public class D {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Java";
        String str2 = "Programming";

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);

        // String length
        System.out.println("Length of result: " + result.length());

        // Character at index
        System.out.println("Character at index 2: " + result.charAt(2));

        // Substring
        System.out.println("Substring (0 to 4): " + result.substring(0, 4));

        // To UpperCase and LowerCase
        System.out.println("Uppercase: " + result.toUpperCase());
        System.out.println("Lowercase: " + result.toLowerCase());

        // Equals and EqualsIgnoreCase
        String str3 = "java programming";
        System.out.println("Equals: " + result.equals(str3));
        System.out.println("Equals Ignore Case: " + result.equalsIgnoreCase(str3));

        // Contains
        System.out.println("Contains 'Java': " + result.contains("Java"));

        // Replace
        String replaced = result.replace("Java", "Python");
        System.out.println("Replaced: " + replaced);
    }
}
