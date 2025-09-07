



import java.util.Scanner;

public class eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            sum += sc.nextInt();
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}