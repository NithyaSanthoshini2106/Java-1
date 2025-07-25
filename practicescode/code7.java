public class code7 {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println(str.length());          // 16
        System.out.println(str.toUpperCase());     // JAVA PROGRAMMING
        System.out.println(str.toLowerCase());     // java programming
        System.out.println(str.charAt(5));         // P
        System.out.println(str.indexOf("gram"));   // 8
        System.out.println(str.substring(5));      // Programming
        System.out.println(str.contains("Java"));  // true
    }
}
