class Testsix{
    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[] args) {
     Testsix t1=new Testsix();
     System.out.println(t1.a+t1.b+c); //600
     
     Testsix t2=new Testsix();
     System.out.println(t2.a+t2.b+t2.c);//600
     System.out.println(t1.a+t2.b+Testsix.c);  
     
     t1.a=11;
     t2.b=22;
     Testsix.c=33;
     
     System.out.println(t1.a+t2.a);//111
     System.out.println(t1.a+t2.b+c);//66

    }
}