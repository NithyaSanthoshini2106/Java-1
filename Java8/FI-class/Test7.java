import java.util.function.Function;
import java.util.function.Predicate;

interface Funcation_Three {
    public int apply(int num);
}
class Test7 {
    public static void main(String[] args) {
        Predicate<String>  obj=ename ->ename.length()>5;
        System.out.println(obj.test("Nithya Santhoshini"));  
    }
}