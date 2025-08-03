public class eight8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.println(i + " is even");
        }
    }
}
