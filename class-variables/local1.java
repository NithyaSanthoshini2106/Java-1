public class local1 {
    public void displayMessage() {
        // Local variable 
        String message = "Hello from a local variable!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        local1 example = new local1();
        example.displayMessage();
    }
}

