public class code3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

      
        System.out.println("Bitwise Operators:");
        System.out.println("x & y = " + (x & y));   // AND
        System.out.println("x | y = " + (x | y));   // OR
        System.out.println("x ^ y = " + (x ^ y));   // XOR
        System.out.println("~x = " + (~x));         // NOT
        System.out.println("x << 1 = " + (x << 1)); // Left shift
        System.out.println("x >> 1 = " + (x >> 1)); // Right shift
        System.out.println("\nUnary Operators:");
        int a = 7;
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a)); 
        System.out.println("a++ = " + (a++)); 
        System.out.println("Now a = " + a);
        System.out.println("--a = " + (--a)); 
        System.out.println("a-- = " + (a--)); 
        System.out.println("Now a = " + a);
        System.out.println("\nAssignment Operators:");
        int z = 20;
        z += 5;   // z = z + 5
        System.out.println("z += 5: " + z);
        z -= 2;   // z = z - 2
        System.out.println("z -= 2: " + z);
        z *= 2;   // z = z * 2
        System.out.println("z *= 2: " + z);
        z /= 3;   // z = z / 3
        System.out.println("z /= 3: " + z);
        z %= 4;   // z = z % 4
        System.out.println("z %= 4: " + z);
    }
}
