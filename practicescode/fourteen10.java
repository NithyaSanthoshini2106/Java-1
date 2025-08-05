import java.util.Scanner;

public class fourteen10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, result = 0;

        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, 3); // cube
            num /= 10;
        }

        if (result == original)
            System.out.println(original);
        else
            System.out.println(original);
    }
}
