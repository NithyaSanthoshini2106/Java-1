@FunctionalInterface
interface AddOperation {
    int add(int a, int b);
}

public class Test1 {
    public static void main(String[] args) {
        AddOperation sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.add(10, 20));
    }
}
