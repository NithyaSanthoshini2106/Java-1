import java.util.ArrayList;
import java.util.Collections;

public class practicesix {
    public static void main(String[] args) {
       
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.remove("Banana");
        System.out.println(list);
        boolean hasMango = list.contains("Mango");
        System.out.println(hasMango);
        System.out.println("Fruits:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
