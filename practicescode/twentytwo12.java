import java.util.HashSet;

public class twentytwo12 {
    public static boolean hasPairWithDiff(int[] arr, int diff) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num - diff) || set.contains(num + diff)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 20, 3, 2, 50, 80};
        int diff = 78;

        System.out.println("Pair with difference " + diff + " exists: " + hasPairWithDiff(arr, diff));
    }
}
