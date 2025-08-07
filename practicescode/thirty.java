import java.util.*;

public class thirty {
    public static int smallestSubarray(int[] arr, int target) {
        int n = arr.length, minLen = Integer.MAX_VALUE, sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left++];
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int len = smallestSubarray(arr, target);
        System.out.println(target  + len);
    }
}
