import java.io.*;

public class Testread1 {

    public static void main(String[] args) {
        try {
            PrintWriter p = new PrintWriter("abc.txt");
            p.println("Hello, this is a test!");
            p.close();
            System.out.println(p);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
