@FunctionalInterface
interface MyFunction {
    int operate(int a, int b);
}

public class twokittu {
    public static void main(String[] args) {
        MyFunction add = (a, b) -> a + b;
        System.out.println(add.operate(10, 20)); 
    }
}
