import java.io.*;

public class nine5 {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("file.txt");  // Might throw FileNotFoundException
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File handling error: " + e.getMessage());
        }
    }
}
