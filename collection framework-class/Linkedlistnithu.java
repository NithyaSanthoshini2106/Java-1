import java.util.LinkedList;

public class Linkedlistnithu {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        // Adding elements
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");

        // Adding at first and last
        cities.addFirst("Hyderabad");
        cities.addLast("Bangalore");

        // Displaying list
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
