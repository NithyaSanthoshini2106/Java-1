import java.util.*;

public class three1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("Stack: " + stack);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");
        System.out.println("\nQueue: " + queue);
        System.out.println("First element (peek): " + queue.peek());
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
