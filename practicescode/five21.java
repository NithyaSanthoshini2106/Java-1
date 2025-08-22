




import java.util.*;

public class five21 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
