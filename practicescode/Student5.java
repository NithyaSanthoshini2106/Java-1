import java.util.ArrayList;

class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Student5 {
    ArrayList<Student> students;
    Student5() {
        students = new ArrayList<>();
        students.add(new Student("Nithya", 23));
        students.add(new Student("Raju", 21));
        students.add(new Student("Kiran", 22));
    }

    void showAllStudents() {
        for (Student s : students) {
            s.display();
        }
    }

    public static void main(String[] args) {
        Student5 list = new Student5(); 
        list.showAllStudents();            
    }
}
