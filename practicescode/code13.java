public class code13 {
    public static void main(String[] args) {
        String input = "Programming";
        int count = 0;

        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println("Vowels: " + count); 
    }
}
