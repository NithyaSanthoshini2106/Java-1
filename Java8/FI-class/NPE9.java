import java.util.Optional;

public class NPE9 {
    public static void main(String[] args) {
        String ename = "Nithya";          
        Optional.ofNullable(ename)
                .ifPresentOrElse(
                    System.out::println,          
                    () -> System.out.println("String is Null")  
                );
    }
}
