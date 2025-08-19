


public class two18 {
    public static void main(String[] args) {
        int age = 20;
        int marks = 75;

        if (age >= 18) {
            if (marks >= 60) {
                System.out.println("Eligible for job");
            } else {
                System.out.println("Not enough marks");
            }
        } else {
            System.out.println("Not eligible due to age");
        }
    }
}
