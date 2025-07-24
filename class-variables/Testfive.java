class Testfive{
    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[] args) {
     Testfive t1=new Testfive();
     System.out.println(t1.a+t1.b+c); //600
     
     Testfive t2=new Testfive();
     System.out.println(t2.a+t2.b+t2.c);//600
     System.out.println(t1.a+t2.b+Testfive.c);     
    }
}