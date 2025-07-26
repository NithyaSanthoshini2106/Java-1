abstract class Person {
    String name;
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }

    void showName() {
        System.out.println("Name: " + name);
    }
    abstract void role();
}

public class Student3 extends Person {
    int age;

    Student3(String name, int age) {
        super(name); 
        this.age = age;
        System.out.println("Student constructor called");
    }
    void role() {
        System.out.println("Role: Student");
    }

    void display() {
        showName();
        System.out.println("Age: " + age);
        role();
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3("Nithya Raju", 23);
        s1.display();
    }
}
