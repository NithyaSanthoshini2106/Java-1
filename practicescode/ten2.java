class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ten2 {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20);
        s1.show();
    }
}
