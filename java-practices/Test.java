

class MyClass {
    
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;  
    private int privateVar = 40;

    public void show() {
        System.out.println("Public Var: " + publicVar);
        System.out.println("Protected Var: " + protectedVar);
        System.out.println("Default Var: " + defaultVar);
        System.out.println("Private Var: " + privateVar);
    }
}

public class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        
        System.out.println(obj.publicVar);     
        System.out.println(obj.protectedVar);   
        System.out.println(obj.defaultVar);     
        
        
        obj.show(); 
    }
}
