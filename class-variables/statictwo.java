

public class  statictwo {
    static int count = 1; // static variable

    statictwo() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        statictwo c1 = new statictwo();
        statictwo c2 = new statictwo();
        statictwo c3 = new statictwo();
        statictwo c4 = new statictwo();
        statictwo c5 = new statictwo();
        statictwo c6 = new statictwo();
        statictwo c7 = new statictwo();
        statictwo c8 = new statictwo();

    }
}
