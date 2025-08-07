abstract class A{}


abstract class Dao {

    public int login(){
        return 1;

    }
    public abstract boolean forgetPwd();

}
class DaoImpl extends Dao{
    public boolean forgetPwd(){
        return true;
    }
}
public class Main{
    public static void main(String[] args) {

        DaoImpl obj=new DaoImpl();
        System.out.println(obj.login());
        System.out.println(obj.forgetPwd());
        
    }
}