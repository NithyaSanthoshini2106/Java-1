import java.util.*;

public class twentynine12 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 7};
        int[] arr2 = {5, 6, 3, 4, 8};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num);
        }

        System.out.println("Pairs with sum " + target + ":");
        for (int num : arr1) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println(num + " + " + complement);
            }
        }
    }
}
