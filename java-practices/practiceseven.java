import java.util.HashMap;
import java.util.Map;

public class practiceseven {
    public static void main(String[] args) {
      
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        System.out.println(map);
        System.out.println(map.get(2));
        map.remove(1);
        System.out.println(map);
        System.out.println("Iterating Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
