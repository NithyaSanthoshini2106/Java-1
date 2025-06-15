
class Student {
    
    String name;
    int age;

    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class vasu {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        
        s1.name = "Nithya";
        s1.age = 20;

       
        s1.displayInfo();
    }
}
