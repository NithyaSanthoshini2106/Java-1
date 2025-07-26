class code19 {
    String name;
    int age;
    code19(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        code19 s1 = new code19("Nithya Raju", 23);
        s1.display();
    }
}
