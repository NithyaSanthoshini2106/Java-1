public class seven3 {
    public static void main(String[] args) {
        int a = 25, b = 42, c = 17;

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is: " + largest);
    }
}
