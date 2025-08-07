import java.util.HashSet;

public class fourteen12 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int maxLen = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }
}
