



public class New4 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int key = 20;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(key);
        } else {
            System.out.println(key);
        }
    }
}
