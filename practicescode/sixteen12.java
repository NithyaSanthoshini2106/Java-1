import java.util.HashSet;

public class sixteen12 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2};
        HashSet<Integer> seen = new HashSet<>();

        boolean hasDuplicate = false;
        for (int num : nums) {
            if (!seen.add(num)) {
                hasDuplicate = true;
                break;
            }
        }

        System.out.println(hasDuplicate);
    }
}
