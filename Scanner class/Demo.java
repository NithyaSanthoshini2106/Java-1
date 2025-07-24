import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your marks: ");
        double marks = scanner.nextDouble();
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);

        scanner.close();
    }
}
