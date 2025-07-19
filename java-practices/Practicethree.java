import java.util.*;

public class Practicethree {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Nithya Santhoshini");
        names.add("Nithya Nithu");
        names.addFirst("Spoorthi");
        names.addLast("Raju Nithu");
        System.out.println(names);
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); 
        System.out.println(numbers);
        TreeMap<String, Integer> scoreMap = new TreeMap<>();
        scoreMap.put("Math", 85);
        scoreMap.put("English", 92);
        scoreMap.put("Science", 78);
        System.out.println(scoreMap);
        System.out.println("\nIterating TreeMap:");
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
