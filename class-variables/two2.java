




public class two2 {
    int instanceVar = 765;
    static String course = "Java Programming Langauge";

    public void showVariables() {
        // Local variable
        int localVar = 1045;
        
        System.out.println(localVar);
        System.out.println(instanceVar);
        System.out.println(course);
    }

    public static void main(String[] args) {
        two2 obj = new two2();
        obj.showVariables();
    }
}
