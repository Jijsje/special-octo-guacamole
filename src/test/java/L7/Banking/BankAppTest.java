package L7.Banking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

class BankAppTest {

	Account accountA, accountB;

	@BeforeEach
	void setUp() {
		BankApp bankApp = Mockito.mock(BankApp.class);
		accountA = Mockito.mock(Account.class);
		accountB = Mockito.mock(Account.class);
		when(bankApp.openAccount()).thenReturn(accountA, accountB);
		Mockito.doCallRealMethod().when(accountA).getBalance();
		Mockito.doCallRealMethod().when(accountA).getBalance();

	}

	@Test
	void testGetBalance() {
		when(accountA.getBalance()).thenReturn(50.0);
		Assertions.assertEquals(50.0, accountA.getBalance());
	}

	@Test
	void testDeposit() {
		Mockito.doCallRealMethod().when(accountA).deposit(2000);
		accountA.deposit(2000);
		Assertions.assertEquals(2000, accountA.getBalance());
	}

	@Test
	void testTransfer() {

	}
//        a.transfer(b,500);
//        System.out.println("Balance a and b after transfer: "+a.getBalance()+" & "+b.getBalance());
//
//        b.withdraw(600);
//        System.out.println("Overdraw of Account b");
//
//    oneYearPasses();
//        System.out.println("Balance a after 1 year: "+a.getBalance());
//        System.out.println("Balance b after 1 year: "+b.getBalance());
}
