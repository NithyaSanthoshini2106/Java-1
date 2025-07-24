import java.util.function.Function;

interface Funcation_Three {
    public int apply(int num);
}
class Test6 {
    public static void main(String[] args) {
        Function<Integer, Integer> fb = num -> num * num;

        System.out.println(fb.apply(10));  // Output: 100
    }
}