interface Person {
    void showDetails();
}

public class Student4 implements Person {
    String name;
    int age;

    Student4(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student constructor called");
    }
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student4 s = new Student4("Nithya", 23);
        s.showDetails();
    }
}
