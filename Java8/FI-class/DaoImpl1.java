@FunctionalInterface
interface Dao {
    void login();  // Only one abstract method
}

public class DaoImpl1 implements Dao {
    public void login() {
        System.out.println("Login Success");
    }

    public static void main(String[] args) {
        Dao dao = new DaoImpl1();
        dao.login();
    }
}
