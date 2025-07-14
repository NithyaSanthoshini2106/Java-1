import java.util.Optional;

public class NPE8 {
    public static void main(String[] args) {
        String ename = "Nithya";          
        String output = Optional.ofNullable(ename)
                                .orElse("String is Null");
        System.out.println(output);
    }
}
