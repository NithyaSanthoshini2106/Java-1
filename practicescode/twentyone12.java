import java.util.HashMap;

public class twentyone12 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
                break;
            }
        }
    }
}
