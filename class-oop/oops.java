// Abstraction using abstract class
abstract class Account {
    protected int accNumber;
    protected String accHolder;

    public Account(int accNumber, String accHolder) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
    }

    // Abstract method
    abstract void calculateInterest();

    // Common method
    void displayDetails() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Holder: " + accHolder);
    }
}

// Inheritance: SavingAccount inherits from Account
class SavingAccount extends Account {
    private double balance;
    private double interestRate = 0.05;

    public SavingAccount(int accNumber, String accHolder, double balance) {
        super(accNumber, accHolder);
        this.balance = balance;
    }

    // Polymorphism: Overriding method
    void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Interest earned (Saving): " + interest);
    }
}

// Encapsulation: private data + getters/setters
class Customer {
    private String name;
    private String email;

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    public String getName() { return name; }
    public String getEmail() { return email; }
}

public class oops {
    public static void main(String[] args) {
        // Encapsulation
        Customer c = new Customer();
        c.setName("Aarav");
        c.setEmail("aarav@example.com");
        System.out.println("Customer Name: " + c.getName());
        System.out.println("Customer Email: " + c.getEmail());

        // Abstraction, Inheritance, Polymorphism
        Account acc = new SavingAccount(12345, "Aarav", 10000);
        acc.displayDetails();
        acc.calculateInterest();  // Polymorphism: overridden method
    }
}
