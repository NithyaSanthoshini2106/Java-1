import java.util.Scanner;

public class ten7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add\n2. Subtract\n3. Exit");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (5 + 3));
                break;
            case 2:
                System.out.println("Result: " + (5 - 3));
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option!");
        }
    }
}
