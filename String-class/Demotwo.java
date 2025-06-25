public class Demotwo {

    public static void main(String[] args) {
        int a=100;
        Integer b=a;
        Integer c= Integer.valueOf(a);

        System.out.println(b == c);
        System.err.println(b == a);
        
    }
    
}
