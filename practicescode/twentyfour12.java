import java.util.HashSet;

public class twentyfour12 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int current = num;
                int streak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        System.out.println(longest);
    }
}
