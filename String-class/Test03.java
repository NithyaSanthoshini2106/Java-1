import java.io.*;

public class Test03 {
    public static void main(String[] args) {
        try {
            PrintWriter PW = new PrintWriter("abc.txt");
            System.out.println("File created successfully.");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
