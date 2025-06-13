class BankAccount {
    
    private String accountHolder;
    private double balance;

    
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    
    public String getAccountHolder() {
        return accountHolder;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class Testenp2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Nithya", 1000);
        account.deposit(500);    
        account.withdraw(200);   

        System.out.println(account.getAccountHolder());
        System.out.println(account.getBalance());
    }
}
