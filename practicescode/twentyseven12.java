import java.util.HashMap;

public class twentyseven12 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;

        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0, count = 0;

        for (int num : arr) {
            xor ^= num;
            if (xor == k) count++;
            count += map.getOrDefault(xor ^ k, 0);
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        System.out.println("Subarrays with XOR " + k + ": " + count);
    }
}
