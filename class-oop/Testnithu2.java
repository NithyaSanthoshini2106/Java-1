class Parent {
    public void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child method (overridden)");
    }

    public void childOnly() {
        System.out.println("Child-specific method");
    }
}

public class Testnithu2 {
    public static void main(String[] args) {
        Parent obj = new Child(); 
        obj.show();  
        
    }
}
