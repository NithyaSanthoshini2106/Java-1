


import java.util.function.*;

public class five {
    public static void main(String[] args) {
        
        // 1. Predicate<T>
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10)); // true

        // 2. Function<T,R>
        Function<String, Integer> lengthFunc = str -> str.length();
        System.out.println(lengthFunc.apply("Java"));

        // 3. Consumer<T>
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("World");

        // 4. Supplier<T>
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        // 5. BiPredicate<T,U>
        BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
        System.out.println(checkLength.test("Java", 4));

        // 6. BiFunction<T,U,R>
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3));

        // 7. BiConsumer<T,U>
        BiConsumer<String, Integer> showInfo = (name, age) -> 
            System.out.println("BiConsumer: " + name + " is " + age + " years old");
        showInfo.accept("Nithya", 22);
    }
}
