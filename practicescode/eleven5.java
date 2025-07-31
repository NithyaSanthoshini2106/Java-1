public class eleven5 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");

            try {
                int[] arr = new int[3];
                arr[5] = 10;  
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index issue");
            }

            int a = 5 / 0;  
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Division by zero");
        }
    }
}
