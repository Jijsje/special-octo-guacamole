package L11.Banking;

import java.sql.Array;
import java.util.ArrayList;

public class Bank {

    public enum AccountType {CHECKING, SAVING}

    public static ArrayList<BankAccount> allAccounts = new ArrayList<>();

    public static void main(String[] args) {
    }

    public BankAccount createAccount(AccountType accountType) {
        if (accountType == AccountType.CHECKING) {
            BankAccount.CheckingAccount check = new BankAccount.CheckingAccount();
            allAccounts.add(check);
            return check;
        } else if (accountType == AccountType.SAVING) {
            BankAccount.SavingsAccount save = new BankAccount.SavingsAccount();
            allAccounts.add(save);
            return save;
        }
        return null;
    }

    public String transfer(BankAccount a, BankAccount b, int amount){
        a.balance += amount;
        b.balance -= amount;
        System.out.println(a.balance);
        System.out.println(b.balance);
        return "Transfer succeeded";
    }

    public void showAccounts(){
        System.out.println(allAccounts);
    }

    abstract static class BankAccount {
        int balance;

        static class CheckingAccount extends BankAccount {
        }

        static class SavingsAccount extends BankAccount {
            int interestRate;
        }
    }
}