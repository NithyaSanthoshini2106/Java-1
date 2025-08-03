import java.util.Scanner;

public class five8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Enter a number (0 to exit): ");
            num = sc.nextInt();

            if (num == 0) {
                System.out.println("Exiting loop...");
                break;
            }

            System.out.println("You entered: " + num);
        }
    }
}
