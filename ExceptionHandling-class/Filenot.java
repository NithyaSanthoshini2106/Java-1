import java.io.*;

public class Filenot {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("nonexistent.txt"); 
        System.out.println(fr);
    }
}
