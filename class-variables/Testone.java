public class Testone {
    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[] args) {
        Testone t1=new Testone();
        System.out.println(t1.a+t1.b+t1.c);  //600
        System.out.println(t1.a+t1.b+t1.c); //600
        System.out.println(t1.a+t1.b+Testone.c);      //600
        Testone t2=new Testone();
        t1.a=11;
        t2.b=22;
        System.out.println(t1.a+t2.a);       //111
        System.out.println(t2.a+t2.b+c);     //600
        Testone.c = 33;
        System.out.println(t1.a+t2.b+t2.c);   //11+200+33 = 244
    }
}