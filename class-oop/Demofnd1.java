class Account {
    int accNo;
    String name;
    double balance;

    // Constructor
    public Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    // Method to open account (display initial details)
    public void open_Acc() {
        System.out.println("Account opened successfully!");
        System.out.println("Account No: " + accNo);
        System.out.println("Account Holder: " + name);
        System.out.println("Initial Balance: " + balance);
    }

    // Method to deposit amount
    public void deposit_Amount(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
    }
}

public class Demofnd1 {
    public static void main(String[] args) {
        Account a1 = new Account(101, "Nithya", 500);
        a1.open_Acc();
        a1.deposit_Amount(5000);
    }
}
