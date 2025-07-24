import java.util.function.Function;

public class eightkittu {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = str -> str.length();
        System.out.println(lengthFunc.apply("Lambda")); 
    }
}
