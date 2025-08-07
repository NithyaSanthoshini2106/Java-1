interface Dao{
    public void login();
    abstract void logout();
    void forgetPwd();
}
class DaoImpl implements Dao{
    public void login(){
        System.out.println("Login Success");
    }
    public void logout(){
        System.out.println("Logout Success");
    }
    public void forgetPwd(){
        System.out.println("Logout Success");
    }
}
class Demo{

    public static void main(String[] args) {
        Dao dao = new DaoImpl();
        dao.login();
        dao.logout();
        dao.forgetPwd();
    }
}