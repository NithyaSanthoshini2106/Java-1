



public class New9 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 65, 76, 98};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nReversed Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
