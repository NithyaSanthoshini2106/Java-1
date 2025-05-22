public class Test1{

    int a=100;
    int b=200;
    static int c=300;

    public static void main(String[] args) {

    Test1 t1=new Test1();
    System.out.println(t1.a+t1.b+t1.c);
    System.out.println(t1.a+t1.b+Test.c);
    System.out.println(t1.a+t1.b+c);
    Test1 t2=new Test1();

    t1.a=11;
    System.out.println(t1.a+t2.a);
    System.out.println(t2.a+t2.b+Test1.c);
    System.out.println(t2.a+t2.b+c);
    }
}