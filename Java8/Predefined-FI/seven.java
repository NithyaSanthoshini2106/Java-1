import java.util.function.BiConsumer;

public class seven {
    public static void main(String[] args) {
        BiConsumer<String, Integer> print = (name, age) -> 
            System.out.println(name + " is " + age + " years old");
        print.accept("Nithya", 22);
    }
}
