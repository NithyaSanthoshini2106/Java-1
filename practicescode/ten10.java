import java.util.ArrayList;
import java.util.Scanner;

public class ten10 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();  

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            String name = sc.nextLine();
            students.add(name);
        }

        System.out.println("\nList of Students:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
