import java.util.HashMap;

public class nineteen12 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0, sum = 0;

        map.put(0, -1); // handle case where subarray starts at index 0

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0) ? -1 : 1;

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        System.out.println(maxLen);
    }
}
