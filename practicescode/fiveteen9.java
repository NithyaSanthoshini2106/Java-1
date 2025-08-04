import java.util.Scanner;

public class fiveteen9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Greet");
            System.out.println("2. Add two numbers");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello! Have a great day.");
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Sum: " + (a + b));
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }
}
