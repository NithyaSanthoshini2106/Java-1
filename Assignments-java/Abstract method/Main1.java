abstract class Account {
    
    
    public void login() {
        System.out.println("Login Successful");
    }

  
    public abstract void resetPassword();
}


class UserAccount extends Account {

    @Override
    public void resetPassword() {
        System.out.println("Password reset link sent to your email");
    }
}

public class Main1 {
    public static void main(String[] args) {
        UserAccount user = new UserAccount();
        user.login();                
        user.resetPassword();        
    }
}
