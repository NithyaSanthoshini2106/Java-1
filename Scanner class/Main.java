import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID (int): ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course Name: ");
        String course = scanner.nextLine();

        System.out.print("Enter Student Grade (char): ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter Percentage (double): ");
        double percentage = scanner.nextDouble();

       
        System.out.println("\n--- Student Details ---");
        System.out.println(id);
        System.out.println(name);
        System.out.println(course);
        System.out.println(grade);
        System.out.println(percentage);

        scanner.close();
    }
}
