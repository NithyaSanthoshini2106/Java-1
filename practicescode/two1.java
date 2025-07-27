import java.util.*;

public class two1 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.addFirst("Bangalore");
        cities.addLast("Chennai");
        System.out.println("LinkedList: " + cities);
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(3); 
        System.out.println("TreeSet (Sorted): " + numbers);
        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("Math", 90);
        marks.put("English", 85);
        marks.put("Science", 95);
        System.out.println("TreeMap (Sorted by subject): " + marks);
    }
}
