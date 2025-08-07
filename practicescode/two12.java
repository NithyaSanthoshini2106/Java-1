import java.util.HashMap;

public class two12 {
    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character Frequencies:");
        for (char ch : freq.keySet()) {
            System.out.println(ch + ": " + freq.get(ch));
        }
    }
}
