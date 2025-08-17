


@FunctionalInterface
interface Printer {
    void print(String msg);
}

public class three {
    public static void main(String[] args) {
        Printer p = System.out::println;
        p.print("Hello from Method Reference!");
    }
}
