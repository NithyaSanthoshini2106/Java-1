public class Demovasu2 {

    int a;
    Demovasu2(int a){
        this.a=a;
        System.out.println("Constructor is speized method");
    }
    public static void main(String[] args) {
        
        Demovasu2 t1=new Demovasu2(1000);
        Demovasu2 t2=new Demovasu2(2000);
        System.err.println(t1.a);
        System.out.println(t2.a);
    }
}
