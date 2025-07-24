public class  onest {
    static int count = 5; // static variable

    onest() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        onest c1 = new onest();
        onest c2 = new onest();
        onest c3 = new onest();
    }
}
