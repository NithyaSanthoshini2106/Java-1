import java.util.HashSet;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }

        System.out.println("Common elements:");
        for (int num : b) {
            if (set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
