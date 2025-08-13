public class twelve {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Running in a thread");
        new Thread(task).start();
    }
}
