import java.util.function.Predicate;

public class four {
    public static void main(String[] args){
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isGreaterThanTen = num -> num > 10;
        System.out.println(isEven.test(4));
        System.out.println(isGreaterThanTen.test(15));
        Predicate<Integer> evenAndGreaterThanTen = isEven.and(isGreaterThanTen);
        System.out.println(evenAndGreaterThanTen.test(14));
        Predicate<Integer> evenOrGreaterThanTen = isEven.or(isGreaterThanTen);
        System.out.println(evenOrGreaterThanTen.test(9));
        System.out.println(isEven.negate().test(7));
    }
}
