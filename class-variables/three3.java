






public class three3 {
    int instanceVar = 76567895;
    static String course = "Java Programming Langauge";

    public void showVariables() {
        int localVar = 1045456378;
        
        System.out.println(localVar);
        System.out.println(instanceVar);
        System.out.println(course);
    }

    public static void main(String[] args) {
        three3 obj = new three3();
        obj.showVariables();
    }
}
