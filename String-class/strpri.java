public class strpri {

    public static void main(String[] args) {

        // String values
        String s1 = "100";
        String s2 = "12.5";
        String s3 = "true";
        String s4 = "A";

        // Convert String to primitive types
        int i = Integer.parseInt(s1);
        double d = Double.parseDouble(s2);
        boolean b = Boolean.parseBoolean(s3);
        char c = s4.charAt(0); // Only 1st character is taken

        // Print the primitive values
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(c);
    }
}
