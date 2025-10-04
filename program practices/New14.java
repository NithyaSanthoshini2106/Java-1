


import java.util.Arrays;

public class New14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 9, 8, 7, 6, 5, 9};
        int[] arr2 = {4, 5, 6, 7 , 6, 5, 4, 6};

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
