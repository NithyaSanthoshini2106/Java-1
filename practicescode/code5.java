public class code5 {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > 5 && b < 10): " + (a > 5 && b < 10));
        System.out.println("(a > 5 || b > 10): " + (a > 5 || b > 10));
        System.out.println("!(a == b): " + !(a == b));

        // 4. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int x = 10;
        x += 5; // same as x = x + 5
        System.out.println("x += 5: " + x);
        x *= 2; // same as x = x * 2
        System.out.println("x *= 2: " + x);

        // 5. Unary Operators
        System.out.println("\nUnary Operators:");
        int c = 7;
        System.out.println("c = " + c);
        System.out.println("++c = " + (++c)); // pre-increment
        System.out.println("c++ = " + (c++)); // post-increment
        System.out.println("After post-increment, c = " + c);
        System.out.println("--c = " + (--c)); // pre-decrement
        System.out.println("c-- = " + (c--)); // post-decrement
        System.out.println("After post-decrement, c = " + c);

        // 6. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
    }
}
