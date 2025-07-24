import java.util.*;

public class practice9 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(25);
        pq.add(10);
        pq.add(40);
        pq.add(5);

        System.out.println("Elements in ascending order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); 
        }
    }
}
