public class practice14 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Nithya");
        sb.append(" Spoorthi");
        System.out.println(sb);
        sb.insert(7, " Reddy");
        System.out.println(sb);
        sb.replace(0, 6, "Dr.");
        System.out.println(sb);
        sb.delete(3, 9);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
