



public class one {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");      // Add text at the end
        sb.insert(5, " World");  // Insert text at index 5
        sb.replace(0, 5, "Hi");  // Replace characters
        sb.delete(3, 9);         // Delete characters from index 3 to 8
        sb.reverse();            // Reverse the string

        System.out.println("Final Result: " + sb);
    }
}
