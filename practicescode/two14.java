import java.util.*;

public class two14 {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana apple";

        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String word : text.split(" ")) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Print result
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
