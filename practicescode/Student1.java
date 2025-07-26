public class Student1 {
    String name;
    int age;

    Student1() {
        name = "Unknown";
        age = 0;
    }
    Student1(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        Student1 s1 = new Student1();
        s1.display();
        Student1 s2 = new Student1("Nithya Killi Raju", 23);
        s2.display();
    }
}
