public class six7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skip when i is 5
            }
            if (i == 8) {
                break; // exit loop when i is 8
            }
            System.out.println(i);
        }
    }
}
