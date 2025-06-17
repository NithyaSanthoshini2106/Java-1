 class Account {
    int accNo;
    String name;
    int balance;

    // Constructor
    public Account(int accNo, String name, int balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void open_Acc() {
        System.out.println();
        System.out.println(accNo);
        System.out.println( name);
        System.out.println(balance);
    }

    public boolean deposit_Amount(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount);
            System.out.println(balance);
            return true;
        } else {
            System.out.println();
            return false;
        }
    }
}

class Demofnd {
    public static void main(String[] args) {
        Account a1 = new Account(101, "Nithya", 500);
        a1.open_Acc();
        a1.deposit_Amount(5000);
    }
}
