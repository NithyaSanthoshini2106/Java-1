interface Dao{
    public void login();
    
}
class DaoImpl implements Dao{
    public void login(){
        System.out.println("Login Success");
    }
    
}
class Demo{

    public static void main(String[] args) {
        Dao dao = new DaoImpl();
        dao.login();
        
    }
}