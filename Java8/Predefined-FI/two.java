import java.util.function.Function;

public class two {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = str -> str.length();
        System.out.println(lengthFunc.apply("Java")); // 4
    }
}
