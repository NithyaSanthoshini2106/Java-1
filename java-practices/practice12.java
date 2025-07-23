public class practice12 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println("s1 == s2: " + (s1 == s2));     
        System.out.println("s1 == s3: " + (s1 == s3));     
        System.out.println("s1.equals(s3): " + s1.equals(s3)); 
        s1.concat(" Programming");
        System.out.println("After concat (s1): " + s1); 
        s1 = s1.concat(" Programming");
        System.out.println("After assigning concat to s1: " + s1); 
        String s4 = s3.intern();
        System.out.println("s1 == s4: " + (s1 == s4)); 
    }
}
