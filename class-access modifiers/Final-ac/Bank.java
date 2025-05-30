 class Bank {
    String A = "State Bank of India";

    void displayBankName() {
        System.out.println("A: " + A);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.displayBankName();
    }
}
