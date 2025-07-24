public class practice15 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println((a + b));
        System.out.println((a - b));
        System.out.println((a * b));
        System.out.println((a / b));
        System.out.println((a % b));
        System.out.println("\nRelational Operators:");
        System.out.println((a == b));
        System.out.println((a != b));
        System.out.println((a > b));
        System.out.println((a < b));
        System.out.println((a >= b));
        System.out.println((a <= b));
        System.out.println("\nLogical Operators:");
        System.out.println((a > 5 && b < 10));
        System.out.println((a > 5 || b > 10));
        System.out.println((a == b));
        System.out.println("\nAssignment Operators:");
        int x = 10;
        x += 5; 
        System.out.println(x);
        x *= 2; 
        System.out.println(x);
        System.out.println("\nUnary Operators:");
        int c = 7;
        System.out.println(c);
        System.out.println((++c)); 
        System.out.println((c++)); 
        System.out.println(c);
        System.out.println((--c)); 
        System.out.println((c--)); 
        System.out.println(c);
        System.out.println("\nBitwise Operators:");
        System.out.println((a & b));
        System.out.println((a | b));
        System.out.println((a ^ b));
    }
}
