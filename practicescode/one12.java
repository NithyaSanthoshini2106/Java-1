import java.util.HashMap;

public class one12 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("HashMap contents:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }
    }
}
