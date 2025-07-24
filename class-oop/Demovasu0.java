public class Demovasu0 {

    int a;
    Demovasu0(int a){
        this.a=a;
        System.out.println("Constructor is speized method");
    }
    public static void main(String[] args) {
        
        Demovasu0 t1=new Demovasu0(10);
        Demovasu0 t2=new Demovasu0(20);
        System.err.println(t1.a);
        System.out.println(t2.a);
    }
}
