import java.util.*;

public class twentyeight12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Window 1 distinct count: " + map.size());

        for (int i = k; i < arr.length; i++) {
            map.put(arr[i - k], map.get(arr[i - k]) - 1);
            if (map.get(arr[i - k]) == 0) map.remove(arr[i - k]);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.println("Window " + (i - k + 2) + " distinct count: " + map.size());
        }
    }
}
