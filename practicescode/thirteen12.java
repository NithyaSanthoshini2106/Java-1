import java.util.*;

public class thirteen12 {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art"};
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        System.out.println("Grouped Anagrams:");
        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
