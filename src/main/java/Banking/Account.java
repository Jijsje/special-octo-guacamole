public class Account {
    public int accountNumber;
    private double balance;
    private double interest;

    public Account(int accountNumber){
        BankApp.allAccounts.add(this);
        this.accountNumber = accountNumber;
        this.interest = 0.05;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("wat! no munie!");
        }
        else {
            this.balance = balance - amount;
        }
    }

    public void deposit(int amount) {
        this.balance = balance + amount;
    }

    public void transfer(Account recipient, int amount) {
        this.balance = balance - amount;
        recipient.balance = recipient.balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public void applyInterest() {
        balance = balance + (balance*interest);
    }
}