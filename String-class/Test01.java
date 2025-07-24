import java.io.*;

public class Test01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter PW = new PrintWriter("abc.txt");
        System.out.println(PW);
    }
}
