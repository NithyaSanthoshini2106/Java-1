interface Function_one {
    public abstract int add(int a, int b);
}

public class Test3 {

    public static void main(String[] args) {

        Function_one obj=(a,b)->a+b;
        System.out.println(obj.add(10,20));
        
    }
}


