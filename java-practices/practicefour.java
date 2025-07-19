import java.util.*;

public class practicefour {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        deque.add("Middle");
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
