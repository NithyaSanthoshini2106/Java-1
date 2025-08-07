
interface Dao {
    void login();
    void logout();
}

class DaoImpl implements Dao {
    public void login() {
        System.out.println("Login Success");
    }

    public void logout() {
        System.out.println("Logout Success");
    }
}

class Demo3 {
    public static void main(String[] args) {
        Dao dao = new DaoImpl();

        if (args.length == 0) {
            System.out.println("Please provide an argument: login or logout");
        } else {
            if (args[0].equalsIgnoreCase("login")) {
                dao.login();
            } else if (args[0].equalsIgnoreCase("logout")) {
                dao.logout();
            } else {
                System.out.println("Invalid argument. Use: login or logout");
            }
        }
    }
}
