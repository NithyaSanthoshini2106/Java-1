import java.io.*;

public class Test02 {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("abc.txt");
            pw.println(pw);
            pw.close();
            System.out.println(pw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
