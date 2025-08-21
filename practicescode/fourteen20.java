


import java.util.*;

public class fourteen20 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        map.forEach((k,v) -> System.out.println(k + v));
    }
}
