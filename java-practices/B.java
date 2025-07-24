

public class B {

    public int a = 1;      
    protected int b = 2;   
    int c = 3;             
    private int d = 4;    

    public void display() {
        System.out.println( + a);
        System.out.println( + b);
        System.out.println( + c);
        System.out.println( + d);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}


