



import java.util.Arrays;

public class New5 {
    public static void main(String[] args) {
        int[] arr = {50, 10, 40, 20, 30};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
