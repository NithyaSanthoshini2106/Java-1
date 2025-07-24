public class practice17 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println("Bitwise Operators:");
        System.out.println((x & y));  
        System.out.println((x | y));   
        System.out.println((x ^ y));  
        System.out.println((~x));         
        System.out.println((x << 1)); 
        System.out.println((x >> 1)); 
        System.out.println("\nUnary Operators:");
        int a = 7;
        System.out.println(a);
        System.out.println((++a));
        System.out.println((a++)); 
        System.out.println(a);
        System.out.println((--a)); 
        System.out.println((a--));
        System.out.println(a);
        System.out.println("\nAssignment Operators:");
        int z = 20;
        z += 5;  
        System.out.println(z);
        z -= 2; 
        System.out.println(z);
        z *= 2;   
        System.out.println(z);
        z /= 3; 
        System.out.println(z);
        z %= 4;  
        System.out.println(z);
    }
}
