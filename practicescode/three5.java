class three5 {
    String name;
    int age;

    three5(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        three5 s1 = new three5("Nithya", 22);
        s1.display();
    }
}
