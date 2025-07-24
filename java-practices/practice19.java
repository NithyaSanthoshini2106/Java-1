import java.util.Scanner;

public class practice19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, choice;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        do {
            System.out.println("\n--- Operator Menu ---");
            System.out.println("1. Arithmetic (+ - * / %)");
            System.out.println("2. Relational (== != > < >= <=)");
            System.out.println("3. Logical (&& || !)");
            System.out.println("4. Bitwise (& | ^ << >>)");
            System.out.println("5. Assignment (+= -= *= /= %=)");
            System.out.println("6. Unary (++ --)");
            System.out.println("7. Ternary (max of a, b)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("a + b = " + (a + b));
                    System.out.println("a - b = " + (a - b));
                    System.out.println("a * b = " + (a * b));
                    System.out.println("a / b = " + (a / b));
                    System.out.println("a % b = " + (a % b));
                    break;

                case 2:
                    System.out.println("a == b: " + (a == b));
                    System.out.println("a != b: " + (a != b));
                    System.out.println("a > b: " + (a > b));
                    System.out.println("a < b: " + (a < b));
                    System.out.println("a >= b: " + (a >= b));
                    System.out.println("a <= b: " + (a <= b));
                    break;

                case 3:
                    System.out.println("(a > 0 && b > 0): " + (a > 0 && b > 0));
                    System.out.println("(a > 0 || b > 0): " + (a > 0 || b > 0));
                    System.out.println("!(a == b): " + !(a == b));
                    break;

                case 4:
                    System.out.println("a & b = " + (a & b));
                    System.out.println("a | b = " + (a | b));
                    System.out.println("a ^ b = " + (a ^ b));
                    System.out.println("a << 1 = " + (a << 1));
                    System.out.println("a >> 1 = " + (a >> 1));
                    break;

                case 5:
                    int x = a;
                    x += b;
                    System.out.println("x += b: " + x);
                    x -= b;
                    System.out.println("x -= b: " + x);
                    x *= b;
                    System.out.println("x *= b: " + x);
                    x /= (b != 0 ? b : 1);
                    System.out.println("x /= b: " + x);
                    x %= (b != 0 ? b : 1);
                    System.out.println("x %= b: " + x);
                    break;

                case 6:
                    int c = a;
                    System.out.println("Original a = " + c);
                    System.out.println("++a = " + (++c));
                    System.out.println("a++ = " + (c++));
                    System.out.println("After a++ = " + c);
                    System.out.println("--a = " + (--c));
                    System.out.println("a-- = " + (c--));
                    System.out.println("After a-- = " + c);
                    break;

                case 7:
                    int max = (a > b) ? a : b;
                    System.out.println("Max of a and b is: " + max);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
