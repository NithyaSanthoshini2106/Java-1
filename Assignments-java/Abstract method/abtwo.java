// Abstract class
abstract class Bank {
    // Abstract method
    abstract int getInterestRate();
}

// Subclass 1
class SBI extends Bank {
    int getInterestRate() {
        return 7;
    }
}

// Subclass 2
class ICICI extends Bank {
    int getInterestRate() {
        return 8;
    }
}

public class abtwo
 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");

        ICICI icici = new ICICI();
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
    }
}
