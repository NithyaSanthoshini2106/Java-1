import java.util.Scanner;

public class fiveteen11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
        System.out.print("Choose an operation (1-4): ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1: System.out.println((a + b)); break;
            case 2: System.out.println((a - b)); break;
            case 3: System.out.println((a * b)); break;
            case 4: 
                if(b != 0)
                    System.out.println((a / b));
                else
                    System.out.println("Cannot divide by zero!");
                break;
            default: System.out.println("Invalid choice!");
        }
    }
}
