// Grandparent class
class Gp {
    public void m1() {
        System.out.println("Gp class m1 method");
    }

    public void m2() {
        System.out.println("Gp class m2 method");
    }
}

// Parent class extends Gp
class Parent extends Gp {
    public void m3() {
        System.out.println("Parent class m3 method");
    }
}

// Child class extends Parent
class Child extends Parent {
    public void m4() {
        System.out.println("Child class m4 method");
    }
}

// Main class
public class Testclass {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.m1();   
        obj.m2();  
        obj.m3();  
        obj.m4();  
    }
}
