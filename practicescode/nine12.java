import java.util.HashMap;

public class nine12 {
    public static void main(String[] args) {
        String text = "java is easy and java is powerful";
        String[] words = text.split(" ");
        HashMap<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        for (String word : freq.keySet()) {
            System.out.println(word + " => " + freq.get(word));
        }
    }
}
