import java.util.HashMap;

public class seven12 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 5, 7, 8, 6};
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Duplicate elements:");
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " occurs " + map.get(key) + " times");
            }
        }
    }
}
