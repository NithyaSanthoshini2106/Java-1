public class  staticthree {
    static int count = 10; // static variable

    staticthree() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        staticthree c1 = new staticthree();
        staticthree c2 = new staticthree();
        staticthree c3 = new staticthree();
        staticthree c4 = new staticthree();
        staticthree c5 = new staticthree();
        staticthree c6 = new staticthree();
        staticthree c7 = new staticthree();
        staticthree c8 = new staticthree();
        staticthree c9 = new staticthree();
        staticthree c10 = new staticthree();

    }
}
