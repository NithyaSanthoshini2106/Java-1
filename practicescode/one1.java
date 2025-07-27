import java.util.*;

public class one1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); 
        System.out.println("ArrayList: " + fruits);
        Set<String> uniqueFruits = new HashSet<>(fruits); 
        System.out.println("HashSet: " + uniqueFruits);
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 40);
        fruitPrices.put("Mango", 60);
        System.out.println("HashMap: " + fruitPrices);
        System.out.println("Price of Mango: " + fruitPrices.get("Mango"));
    }
}
