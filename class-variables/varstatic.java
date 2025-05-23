public class varstatic {
    static int count = 0; // static variable

    varstatic() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        varstatic c1 = new varstatic();
        varstatic c2 = new varstatic();
        varstatic c3 = new varstatic();
    }
}
