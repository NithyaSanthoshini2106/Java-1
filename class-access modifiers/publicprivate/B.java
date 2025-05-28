package pack1;
public class B {
    private static void m4(){
        System.out.println("Private Method");
    }

    public static void main(String[] args) {
        A obj=new A();
        obj.m1();
        obj.m2();
        //obj.m3();
        m4();
    }
}
    