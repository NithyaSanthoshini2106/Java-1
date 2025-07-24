import java.util.ArrayList;
import java.util.Scanner;

public class Mainsearch {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<>();
        enames.add("Nithya");
        enames.add("Raju");
        enames.add("Spoorthi");
        enames.add("Modi");
        enames.add("Varma");

        Scanner scanner = new Scanner(System.in);
        System.out.print(enames);
        String searchName = scanner.nextLine();

        if (enames.contains(searchName)) {
            System.out.println(searchName + " found in the list.");
        } else {
            System.out.println(searchName + " not found in the list.");
        }

        scanner.close();
    }
}
