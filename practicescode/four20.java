


public class four20 {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 5;

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println(max);
    }
}
