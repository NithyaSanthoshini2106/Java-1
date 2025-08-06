public class fourteen11 {
    public static void main(String[] args) {
        String str = "Java Full Stack Developer";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println( rev);
    }
}
