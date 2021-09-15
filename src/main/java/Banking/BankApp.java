import java.util.ArrayList;

public class BankApp {

    public static ArrayList<Account> allAccounts = new ArrayList<>();

    public static void main (String[] args) {
        Account a = new Account(111);
        System.out.println("Balance a: " + a.getBalance());
        Account b = new Account(222);
        System.out.println("Balance b: " + b.getBalance());

        a.deposit(2000);
        System.out.println("Balance a after deposit: " + a.getBalance());
        a.transfer(b, 500);
        System.out.println("Balance a and b after transfer: " + a.getBalance() + " & " + b.getBalance());

        b.withdraw(600);
        System.out.println("Overdraw of Account b");

        oneYearPasses();
        System.out.println("Balance a after 1 year: " + a.getBalance());
        System.out.println("Balance b after 1 year: " + b.getBalance());
    }

    private static void oneYearPasses() {
        allAccounts.forEach(Account::applyInterest);
    }
}