import java.io.*;

public class Mainthree {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello");
        pw.close();
        System.out.println(pw);
    }
}
