import java.util.Deque;
import java.util.ArrayDeque;
 
public class practice3 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");  
        deque.addLast("B");  
        deque.addFirst("C");
        deque.addLast("D");
        System.out.println(deque);
        String front = deque.removeFirst();
        String back = deque.removeLast();
        System.out.println(front);
        System.out.println(back);
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
