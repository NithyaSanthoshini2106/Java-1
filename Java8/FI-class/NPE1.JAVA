public class NPE1 {
    public static void main(String[] args) {
        String name = null;

        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println(name);
        }
    }
}
