import java.util.function.Supplier;

public class onenithya {
    public static void main(String[] args) {
        Supplier<Integer> s1 = () -> 100;
        Supplier<String> s2 = () -> "NITHYA SPOORTHI ";
        Supplier<Boolean> s3 = () -> 100 > 200;

        System.out.println(s1.get()); 
        System.out.println(s2.get());
        System.out.println(s3.get()); 
    }
}
