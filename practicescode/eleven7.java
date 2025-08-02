import java.util.Scanner;

public class eleven7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter a word (or 'exit' to quit): ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("You typed: " + input);
        }

        System.out.println("Program ended.");
    }
}
