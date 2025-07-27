import java.util.ArrayList;

public class seven1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Anil");
        students.add("Bhavana");
        students.add("Chandra");
        students.add("Divya");
        System.out.println("Student List:");
        for (String name : students) {
            System.out.println(name);
        }
        students.remove("Chandra");
        System.out.println("\nAfter Removing 'Chandra':");
        for (String name : students) {
            System.out.println(name);
        }
        String searchName = "Divya";
        if (students.contains(searchName)) {
            System.out.println("\n" + searchName + " is in the list.");
        } else {
            System.out.println("\n" + searchName + " is not in the list.");
        }
    }
}
