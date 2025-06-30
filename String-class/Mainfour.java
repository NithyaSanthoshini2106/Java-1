public class Mainfour {
    static void validate(int marks) throws Exception {
        if (marks < 0) {
            throw new Exception("Marks cannot be negative");
        } else {
            System.out.println(marks);
        }
    }

    public static void main(String[] args) {
        try {
            validate(-10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
