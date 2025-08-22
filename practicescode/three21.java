

import java.util.*;

public class three21 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); 
        System.out.println(numbers);
        for(int num : numbers){
            System.out.println(num);
        }
    }
}
