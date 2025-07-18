import java.util.*;

public class practiceone{
    public static void main(String[] args) {

        
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");  
        System.out.println("List (ArrayList): " + fruits);
        Set<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Delhi");  
        System.out.println("Set (HashSet): " + cities);

        
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(1, "C++");  
        System.out.println("Map (HashMap): " + map);

        
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
