public class seven5 {
    public static void main(String[] args) {
        try {
            int a = 5 / 1;
            System.out.println("Result: " + a);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block is always executed.");
        }
    }
}
