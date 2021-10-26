package L11.Banking;

import org.junit.jupiter.api.Test;

import static L11.Banking.Bank.AccountType.*;
import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    public void testCreateAccount() {
        // create a new bank
        Bank bank = new Bank();
        // create some accounts of both types
        Bank.BankAccount a = bank.createAccount(CHECKING);
        Bank.BankAccount b = bank.createAccount(CHECKING);
        Bank.BankAccount c = bank.createAccount(SAVING);
        // show all accounts
        bank.showAccounts();
        // transfer some money
        System.out.println(bank.transfer(a, b, 40));
    }
}