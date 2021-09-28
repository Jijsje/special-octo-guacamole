package L7.Banking;

import java.util.ArrayList;

// Je heb ook .idea en target gecommit; die horen niet in je repo. gitignore?

public class BankApp {

    // Waarom is dit static? nu is er maar één counter en één allAccounts voor alle banken
    // bovendien mis is de class Bank. Het zou beter zijn om de volgende classes te onderscheiden:
    // Bank, Account en App, ieder met de juiste verantwoordelijkheid.
    private static int accountCounter;
    public static ArrayList<Account> allAccounts = new ArrayList<>();

    public static void main (String[] args) {

        accountCounter = 0;

        // /* Tests
        BankApp bankApp = new BankApp();
        Account a = bankApp.openAccount();
        System.out.println("Balance van account 111: " + a.getBalance());
        Account b = bankApp.openAccount();
        System.out.println("Balance van account 222: " + b.getBalance());


        a.deposit(2000);
        System.out.println("Balance a after deposit: " + a.getBalance());
        a.transfer(b, 500);
        System.out.println("Balance a and b after transfer: " + a.getBalance() + " & " + b.getBalance());

        b.withdraw(600);
        System.out.println("Overdraw of Account b");

        oneYearPasses();
        System.out.println("Balance a after 1 year: " + a.getBalance());
        System.out.println("Balance b after 1 year: " + b.getBalance());
        // */
    }

    public Account openAccount(){
        return new Account(generateAccountNumber());
    }

    private int generateAccountNumber(){
        accountCounter++;
        return accountCounter;
    }

    private static void oneYearPasses() {
        allAccounts.forEach(Account::applyInterest);
    }
}
