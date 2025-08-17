

@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

public class two {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println(add.operation(10, 20));
        Calculator mul = (a, b) -> a * b;
        System.out.println(mul.operation(5, 4));
    }
}
