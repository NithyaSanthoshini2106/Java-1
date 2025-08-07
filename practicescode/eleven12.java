import java.util.HashMap;

public class eleven12 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 2, 4, 8, 10, 6, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements:");
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " occurs " + map.get(key) + " times");
            }
        }
    }
}
