class six1 {
    private String accountHolder;
    private double balance;


    public six1(String name, double initialBalance) {
        this.accountHolder = name;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        showBalance();
    }

    public static void main(String[] args) {
        six1 acc = new six1("Nithya", 5000);

        acc.showAccountInfo();
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.showBalance();
    }
}
