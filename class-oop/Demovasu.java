public class Demovasu {

    int a;
    Demovasu(int a){
        System.out.println("Constructor is speized method");
    }
    public static void main(String[] args) {
        
        Demovasu t1=new Demovasu(10);
        Demovasu t2=new Demovasu(20);
        System.err.println(t1.a);
        System.out.println(t2.a);
    }
}
