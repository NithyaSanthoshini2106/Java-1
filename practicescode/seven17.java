


import java.util.*;

public class seven17 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 10, 15, 20);

        nums.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .forEach(System.out::println); 
    }
}
