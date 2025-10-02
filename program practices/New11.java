



public class New11 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 34, 67, 98, 56, 98, 78};

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
