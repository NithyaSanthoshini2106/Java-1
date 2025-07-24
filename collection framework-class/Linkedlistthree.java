import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import static java.util.Collections.*;

public class Linkedlistthree {
    public static void main(String[] args) {
        LinkedList<Integer> numbers;
        numbers=new LinkedList<Integer>(Arrays.asList(70,80,18,7));
        System.out.println(numbers);
        int i=0;
        while(i<=numbers.size()-1){
            System.out.println(numbers.get(i));
            i++;
        }
        System.out.println("" );
        for(Integer number: numbers){
            System.out.println(number);
        }
        
    }
}