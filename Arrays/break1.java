public class break1{
    public static void main(String[] args) {
        int min = 500;

        while (true) {  
            if (min >= 400) {
                System.out.println("GM");
                break;  
            }
        }

        System.out.println("Loop exited.");
    }
}
