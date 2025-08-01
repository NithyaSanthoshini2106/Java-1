public class four6 {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);       // true (same object in string pool)
        System.out.println(a == c);       // false (different object)
        System.out.println(a.equals(c));  // true (compares value)
    }
}
