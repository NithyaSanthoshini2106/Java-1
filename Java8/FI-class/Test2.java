interface Function_one {
    public abstract int add(int a, int b);
}

class Test2 implements Function_one {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Function_one obj = new Test2();
        System.out.println(obj.add(10, 20));  // Output: 30
    }
}
