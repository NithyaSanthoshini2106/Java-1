public class nine1 {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        nine1 calc = new nine1();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(5, 15, 25));
        System.out.println(calc.add(12.5, 7.3));
    }
}
