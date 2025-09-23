



public class five {
    public static void main(String[] args) {
        int[] arr = {12098765, 4523456, 75678, 892345, 344567};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
