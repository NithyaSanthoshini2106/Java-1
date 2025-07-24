abstract class Bank {
    abstract void Cal_Bal();
}

class Account extends Bank {

    private String acc_Name;
    private String acc_Email;

    public void setacc_Name(String acc_Name) {
        this.acc_Name = acc_Name;
    }

    public void setacc_Email(String acc_Email) {
        this.acc_Email = acc_Email;
    }

    @Override
    void Cal_Bal() {
        System.out.println("Calculating balance in Account class");
    }
}

class SA extends Account {

    private int acc_Id;
    private int acc_Bal;
    private int min_Bal = 500;

    public void setacc_Id(int acc_Id) {
        this.acc_Id = acc_Id;
    }

    public void setacc_Bal(int acc_Bal) {
        this.acc_Bal = acc_Bal;
    }

    @Override
    void Cal_Bal() {
        System.out.println("SA Balance: " + (acc_Bal - min_Bal));
    }
}

class CA extends Account {

    private int acc_Id;
    private int acc_Bal;
    static int min_Bal = 10000;

    public void setacc_Id(int acc_Id) {
        this.acc_Id = acc_Id;
    }

    public void setacc_Bal(int acc_Bal) {
        this.acc_Bal = acc_Bal;
    }

    @Override
    void Cal_Bal() {
        System.out.println("CA Balance: " + (acc_Bal - min_Bal));
    }
}

public class Demovasuone {
    public static void main(String[] args) {
        SA sa1 = new SA();
        sa1.setacc_Id(101);
        sa1.setacc_Bal(1500);
        sa1.setacc_Email("user@example.com");
        sa1.Cal_Bal(); // Output: SA Balance: 1000

        CA ca1 = new CA();
        ca1.setacc_Id(201);
        ca1.setacc_Bal(25000);
        ca1.setacc_Email("business@example.com");
        ca1.Cal_Bal(); // Output: CA Balance: 15000
    }
}
