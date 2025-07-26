public class Student2 {
    String name;
    int age;

    Student2() {
        this("Default Name", 18); 
        System.out.println("Default constructor called");
    }

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2();            
        s1.display();

        Student2 s2 = new Student2("Nithya Kiran Raju", 23); 
        s2.display();
    }
}
