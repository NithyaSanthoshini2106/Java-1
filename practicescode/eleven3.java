class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class eleven3 {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20);
        s1.display();
    }
}
