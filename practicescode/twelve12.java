import java.util.HashSet;

public class twelve12 {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        boolean found = false;

        for (int num : arr) {
            sum += num;
            if (sum == 0 || set.contains(sum)) {
                found = true;
                break;
            }
            set.add(sum);
        }

        System.out.println(found);
    }
}
