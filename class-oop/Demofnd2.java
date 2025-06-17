class Account {

    int acc_Id;
    String acc_Name;
    int acc_Bal;

  
    Account(int id, String name, int amount) {
        this.acc_Id = id;
        this.acc_Name = name;
        this.acc_Bal = amount;
    }

    public boolean deposit_Amount(int amount) {
        if (amount > 0) {
            this.acc_Bal = this.acc_Bal + amount;
            return true;
        } else {
            return false;
        }
    }
}

public class Demofnd2 {
    public static void main(String[] args) {
        Account a1 = new Account(101, "A", 5000);
        a1.deposit_Amount(100);
        a1.deposit_Amount(50);

        Account a2 = new Account(102, "B", 50000);
        a2.deposit_Amount(100);
        a2.deposit_Amount(50);

        Account a3 = new Account(103, "C", 15000);
        a3.deposit_Amount(100);
        a3.deposit_Amount(50);

        System.out.println(a1.acc_Bal);
        System.out.println(a2.acc_Bal);
        System.out.println(a3.acc_Bal);
    }
}
