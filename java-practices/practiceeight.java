import java.util.HashSet;

public class practiceeight {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); 
        System.out.println("HashSet: " + set);
        System.out.println(set.contains("Banana"));
        set.remove("Mango");
        System.out.println(set);
        System.out.println("Iterating HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
