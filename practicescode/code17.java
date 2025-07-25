public class code17 {
    public static void main(String[] args) {
        String s = " Java   Code ";
        String noSpaces = s.replaceAll("\\s+", "");

        System.out.println(noSpaces); 
    }
}
