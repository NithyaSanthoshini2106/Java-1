import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print( i );
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum);

        scanner.close();
    }
}
