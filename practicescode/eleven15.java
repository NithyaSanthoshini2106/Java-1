public class eleven15 {
    public static void main(String[] args) {
        int n = 5, fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);
        System.out.println(n + fact);
    }
}
