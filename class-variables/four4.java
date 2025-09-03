






public class four4 {
    int instanceVar = 7652;
    static String course = "Java Programming Langauge in Full Stack Development";

    public void showVariables() {
        int localVar = 10455674;
        
        System.out.println(localVar);
        System.out.println(instanceVar);
        System.out.println(course);
    }

    public static void main(String[] args) {
        four4 obj = new four4();
        obj.showVariables();
    }
}
