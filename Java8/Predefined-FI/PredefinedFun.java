import java.util.function.Function;

public class PredefinedFun {
    public static void main(String[] args) {
        Function<String, Integer> strLength = s -> s.length();   
        int len = strLength.apply("Nithya");
        System.out.println(len); 
    }
}
