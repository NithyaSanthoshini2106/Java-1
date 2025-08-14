import java.util.*;
import java.util.stream.Collectors;

class Fruit {
    String name;
    Fruit(String name) { this.name = name; }
    public String toString() { return name; }
}

public class Demo22 {

    // 1️⃣ Static method
    public static int stringToInt(String s) {
        return Integer.parseInt(s);
    }

    // 2️⃣ Instance method (particular object)
    public void printWithPrefix(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        System.out.println("\nInstance Method Reference (particular object):");
        Demo22 demo = new Demo22();
        Arrays.asList("Java", "Lambda")
              .forEach(demo::printWithPrefix);

       
    }
}
