
interface Dao{
    public void login();
    abstract void logout();
}
class DaoImpl implements Dao{
    public void login(){
        System.out.println("Login Success");
    }
    public void logout(){
        System.out.println("Logout Success");
    }
}
class Demo1{

    public static void main(String[] args) {
        Dao dao = new DaoImpl();
        dao.login();
        dao.logout();
    }
}