public class types {
    public static void main(String[] args) {
        // Primitive types
        int age = 25;
        double salary = 55000.50;
        char grade = 'A';
        boolean isEmployed = true;

        // Non-primitive types
        String name = "Adluru Nithya";
        int[] scores = {85, 90, 95};

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Scores: " + java.util.Arrays.toString(scores));
    }
}
