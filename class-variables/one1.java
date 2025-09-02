


public class one1 {
    int instanceVar = 50;
    static String course = "Java Programming Langauge";

    public void showVariables() {
        int localVar = 10;
        
        System.out.println(localVar);
        System.out.println(instanceVar);
        System.out.println(course);
    }

    public static void main(String[] args) {
        one1 obj = new one1();
        obj.showVariables();
    }
}
