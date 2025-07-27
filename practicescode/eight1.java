
class eight1 {
    String name;
    int age;


    eight1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}
class Student extends eight1 {
    String course;
    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }
    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println(course);
    }
    public static void main(String[] args) {
        Student s = new Student("Ravi", 20, "Full Stack Java");
        s.displayInfo();
    }
}
