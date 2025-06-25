public class Demoone {

    public static void main(String[] args) {
        int a=100;
        Integer b=a;
        Integer c= Integer.valueOf(a);

        System.out.println(a == b);
        System.err.println(a == c);
        
    }
    
}
