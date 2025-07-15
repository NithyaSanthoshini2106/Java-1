import java.util.function.Consumer;

public class cons {
    public static void main(String[] args) {
        Consumer<String> slowPrinter = s -> {
            for (char c : s.toCharArray()) {
                System.out.print(c + " ");
            }
            System.out.println();
        };

        slowPrinter.accept("JAVA FULL sTACK DEVELOPER");
    }
}
