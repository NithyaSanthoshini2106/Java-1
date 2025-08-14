import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Person {
    String name;
    int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    public String toString() { return name + " (" + age + ")"; }
}

public class Demo17 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> names = Arrays.asList("Nithya", "Killi", "Rajunithu", "Varma");

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));


    }
}
