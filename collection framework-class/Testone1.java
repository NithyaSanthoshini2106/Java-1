

import java.util.HashSet;

public class Testone1 {
    public static void main(String[] args) {
    
        HashSet<Integer> n = new HashSet<>();
        n.add(101);
        n.add(102);
        n.add(103);
        n.add(104);
        n.add(101);   
        n.add(103);   
        n.add(null);  

        
        System.out.println(n);
    }
}
