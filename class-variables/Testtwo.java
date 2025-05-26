public class Testtwo{
    static String ename="Nithya";
    public static void main(String[] args) {
        //How to access Static variable
        //using class name, object and dictly
        Testtwo t1=new Testtwo();
        System.out.println(Testtwo.ename);
        System.out.println(t1.ename);
        System.out.println(ename);
    }
}