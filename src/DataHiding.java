class BankAcc {
    private double balance;
    public BankAcc(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
public class DataHiding {
    public static void main(String[] args) {
        BankAcc account = new BankAcc(20000);
        account.deposit(3000);
        System.out.println("Balance: " + account.getBalance());
    }
}
