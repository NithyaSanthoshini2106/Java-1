@FunctionalInterface
interface Dao {
    void login();  
}

public class DaoImpl2 {
    public static void main(String[] args) {
    
        Dao dao = () -> System.out.println("Login Success");
        dao.login();  // Output: Login Success
    }
}
