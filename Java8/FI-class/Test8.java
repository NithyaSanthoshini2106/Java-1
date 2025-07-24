import java.util.function.Function;
import java.util.function.Predicate;

interface Predicate_Two {
    public abstract boolean test(String ename);
}
class Test8 {
    public static void main(String[] args) {
        Predicate_Two  obj=ename -> ename.length()>5;
        System.out.println(obj.test("Nithya Santhoshini"));  
    }
}