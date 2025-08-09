import java.io.FileWriter;
import java.io.IOException;

public class twelve14 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, file java programming!");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
