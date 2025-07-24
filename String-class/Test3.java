public class Test3 {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=10;
        //System.out.println(a.equals(b));
        System.out.println(a == b);


        Test3 t1=new Test3();
        Test3 t2=new Test3();

        System.out.println(t1.equals(t2));

        String s1=new String("Spoorthi");

        String s2="Spoorthi";

        System.out.println(s1.equals(s2));


        System.out.println(s1 == s2);


    }
    
}
