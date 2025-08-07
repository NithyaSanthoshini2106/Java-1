import java.util.HashMap;

public class seventeen12 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 5, 7};
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxCount = 0, mostFrequent = arr[0];

        for (int num : arr) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = num;
            }
        }

        System.out.println("Most frequent element: " + mostFrequent + " (occurs " + maxCount + " times)");
    }
}
