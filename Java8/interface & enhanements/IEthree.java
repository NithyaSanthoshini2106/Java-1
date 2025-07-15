@FunctionalInterface
interface Calculator {
    int apply(int a, int b);
}

public class IEthree {
    public static void main(String[] args) {
       
        Calculator add = (x, y) -> x + y;
        System.out.println(add.apply(3, 4));  

        
        Calculator max = Integer::max;
        System.out.println(max.apply(10, 7));  
    }
}
