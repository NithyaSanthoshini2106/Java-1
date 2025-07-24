class Student {
    private int id;
    private String name;

   
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
    class student{}

    public static void main(String[] args) {
        Student s1 = new Student(101, "Nithya");
        System.out.println(s1);              // Implicit toString()
        System.out.println(s1.toString());   // Explicit toString()
    }
}
