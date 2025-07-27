import java.io.*;

public class ten1 {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a file handling example in Java.\n");
            writer.write("Learning file read and write operations.\n");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
