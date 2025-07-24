import java.util.Scanner;

public class practice18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println(max);
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("First number (" + a + ") is: " + result);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        String status = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(status);

        sc.close();
    }
}
