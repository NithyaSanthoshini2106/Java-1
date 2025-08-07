import java.util.HashMap;

public class eight12 {
    public static boolean areEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            if (!map.containsKey(num)) return false;
            map.put(num, map.get(num) - 1);
            if (map.get(num) == 0) map.remove(num);
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4}, b = {4, 3, 2, 1};
        System.out.println(areEqual(a, b));
    }
}
