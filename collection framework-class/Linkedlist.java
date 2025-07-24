

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
      
        LinkedList<String> names = new LinkedList<>();
        names.add("Nithya");
        names.add("Raju");
        names.add("Spoorthi");
        System.out.println(names);
        names.addFirst("Santhoshini Raju");
        names.addLast("Nithya Raju");
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        names.remove("Raju");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println("Looping:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
