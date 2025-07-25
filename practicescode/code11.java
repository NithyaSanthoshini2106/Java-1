public class code11 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        sb.insert(5, ",");
        sb.reverse();

        System.out.println(sb); 
    }
}
