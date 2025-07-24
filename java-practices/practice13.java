public class practice13 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
        sb.insert(6, "Java ");
        System.out.println(sb);
        sb.replace(6, 10, "Amazing");
        System.out.println(sb);
        sb.delete(6, 13);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
