public class four9 {
    public static void main(String[] args) {
        int num = 121;
        int reversed = 0, original = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original);
        } else {
            System.out.println(original);
        }
    }
}
