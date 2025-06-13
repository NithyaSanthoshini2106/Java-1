class Person {
    private String name;  

    
    public void setName(String newName) {
        name = newName;
    }

    
    public String getName() {
        return name;
    }
}

public class Testenp {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Nithya");  
        System.out.println(p);  
    }
}
