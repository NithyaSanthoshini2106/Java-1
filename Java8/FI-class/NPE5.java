import java.util.Optional;

public class NPE5 {

    public static void main(String[] args) {
        String ename = "Nithya";  
        Optional<String> opt = Optional.ofNullable(ename); 

        if (opt.isPresent()) {
            System.out.println(opt.get());
        } else {
            System.out.println(ename);
        }
    }
}
