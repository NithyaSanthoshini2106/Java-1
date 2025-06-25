public class Demothree {

    public static void main(String[] args) {
        int a=100;
        Integer b=a;
        Integer c= Integer.valueOf(a);

        System.out.println(c == a);
        System.err.println(c == b);
        
    }
    
}
