public class nine6 {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        // Output:
        // Java
        // is
        // fun
    }
}
