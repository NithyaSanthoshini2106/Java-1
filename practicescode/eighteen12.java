import java.util.HashSet;

public class eighteen12 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Pairs with sum " + target + ":");
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println(num + " + " + complement);
            }
            set.add(num);
        }
    }
}
