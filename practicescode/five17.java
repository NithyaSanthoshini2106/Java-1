


class Student {
    String name;
    int age;
    void show() {
        System.out.println(name + " is " + age + " years old");
    }
}

public class five17 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Nithya";
        s.age = 22;
        s.show();
    }
}
