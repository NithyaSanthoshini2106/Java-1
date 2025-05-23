public class varlocal {
    public void displayMessage() {
        // Local variable 
        String message = "Hello from a local variable!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        varlocal example = new varlocal();
        example.displayMessage();
    }
}
