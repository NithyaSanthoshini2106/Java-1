





import java.util.Arrays;

public class New17 {
    public static void main(String[] args) {
        int[] arr1 = {23456781, 2876, 378456789, 23456789};
        int[] arr2 = {42345678, 59876543, 62345678, 234567890, 3456789};

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
