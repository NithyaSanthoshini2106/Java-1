public class Demo0 {
    public static void main(String[] args) {
        // Creating strings
        String s1 = "Nithya";
        String s2 = new String("Full Stack");
        String s3 = "Spoorthi";

        // Comparing strings
        System.out.println((s1 == s3)); 
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2)); 

        // String methods
        System.out.println(s2.length());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.charAt(2));
        System.out.println(s2.substring(0, 4));
        System.out.println(s1 + " " + s2);
    }
}
