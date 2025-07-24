public class objstr {

    public static void main(String[] args) {
        
        // Create an object
        Integer num = 100;  // Wrapper class object
        
        // Method 1: Using toString()
        String s1 = num.toString();

        // Method 2: Using String.valueOf()
        String s2 = String.valueOf(num);

        // Method 3: String concatenation
        String s3 = num + "";

        // Print results
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
