import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@FunctionalInterface
interface Greeter {
    String greet(String name);
    default String greetWithDate(String name) {
        return greet(name) + " - " + LocalDate.now();
    }
    static String formattedTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}

public class sixB{
    public static void main(String[] args) {
        Greeter morningGreeter = person -> "Good morning, " + person + "!";
        System.out.println(morningGreeter.greetWithDate("Nithya Spoorthi"));
        System.out.println("Current time: " + Greeter.formattedTime());
    }
}
