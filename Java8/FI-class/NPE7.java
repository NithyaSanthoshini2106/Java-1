import java.util.Optional;

public class NPE7 {
    public static void main(String[] args) {
        String ename = "Nithya";          
        Optional.ofNullable(ename)
                .ifPresent(s -> System.out.println(s));        

       
        if (!Optional.ofNullable(ename).isPresent()) {
            System.out.println("String is Null");
        }
    }
}
