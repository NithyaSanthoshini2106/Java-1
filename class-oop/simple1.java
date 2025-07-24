public class simple1{

    int a;
    simple1(int a){
        System.out.println("Constructor is speized method");
    }
    public static void main(String[] args) {
        
        simple1 t1=new simple1(100);
        simple1 t2=new simple1(200);
        System.err.println(t1.a);
        System.out.println(t2.a);
    }
}
