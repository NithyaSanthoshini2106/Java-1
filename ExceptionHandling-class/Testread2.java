import java.io.*;  // Import required classes from java.io package

public class Testread2 {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter PW = new PrintWriter("abc.txt");
        System.out.println(PW); // This will print object reference, not file content
        PW.close(); // Always close the writer
    }

}
