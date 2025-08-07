import java.util.HashSet;

public class twentythree12 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        HashSet<Integer> seen = new HashSet<>();
        int firstRepeat = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (seen.contains(arr[i])) {
                firstRepeat = arr[i];
            } else {
                seen.add(arr[i]);
            }
        }

        if (firstRepeat != -1)
            System.out.println(firstRepeat);
        else
            System.out.println("No repeating elements.");
    }
}
