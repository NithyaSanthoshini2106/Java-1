import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] students = new String[n];


        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) );
            students[i] = scanner.nextLine();
        }

        
        System.out.println("\n--- Student Names ---");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }

        scanner.close();
    }
}
