interface Funcation_Two {
    public int apply(int num);
}
class Test5 {
    public static void main(String[] args) {
        Funcation_Two obj=num -> num*num;

        System.out.println(obj.apply(10));
    }
}