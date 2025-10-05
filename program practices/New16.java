


import java.util.Arrays;

public class New16 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 8, 9, 7, 6, 8, 5, 3};
        int[] arr2 = {4, 5, 6, 8, 9, 7, 9, 7, 9, 5};

        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.println(Arrays.toString(merged));
    }
}
