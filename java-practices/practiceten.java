import java.util.Map;
import java.util.TreeMap;

public class practiceten {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(4, "Mango");
        map.put(2, "Grapes");
        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        map.remove(2);
        System.out.println(map);
        System.out.println("Iterating TreeMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
