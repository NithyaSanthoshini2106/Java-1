import java.util.HashMap;

public class two2 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 78);
        studentMarks.put("Charlie", 92);
        System.out.println("Student Marks: " + studentMarks);
        System.out.println("Marks of Bob: " + studentMarks.get("Bob"));
        if (studentMarks.containsKey("Alice")) {
            System.out.println("Alice is in the list.");
        }
        studentMarks.remove("Charlie");
        System.out.println("Updated Student Marks: " + studentMarks);
    }
}
