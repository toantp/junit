package demo.junit2;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
			  
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AssertTest {
	class InsufficientFundsException extends RuntimeException {
		public InsufficientFundsException(String message) {
			super(message);
		}

		private static final long serialVersionUID = 1L;
	}

	class Account {
		int balance;
		String name;

		Account(String name) {
			this.name = name;
		}

		void deposit(int dollars) {
			balance += dollars;
		}

		void withdraw(int dollars) {
			if (balance < dollars) {
				throw new InsufficientFundsException("balance only " + balance);
			}
			balance -= dollars;
		}

		public String getName() {
			return name;
		}

		public int getBalance() {
			return balance;
		}

		public boolean hasPositiveBalance() {
			return balance > 0;
		}
	}

	class Customer {
		List<Account> accounts = new ArrayList<Account>();

		void add(Account account) {
			accounts.add(account);
		}

		Iterator<Account> getAccounts() {
			return accounts.iterator();
		}
	}

	private Account account;

	@Before
	public void initAccount() {
		System.out.println("initAccount");
		account = new Account("an account name");
	}

	@Test
	public void hasPositiveBalance() {
		System.out.println("hasPositiveBalance");
		account.deposit(50);
		assertTrue(account.hasPositiveBalance());
	}

	@Test
	public void depositIncreasesBalance1() {
		System.out.println("depositIncreasesBalance");
		int initialBalance = account.getBalance();
		account.deposit(100);
		//assertTrue(account.getBalance() > initialBalance);
		assertThat(initialBalance, equalTo(0));
	}
	
	@Test
	public void depositIncreasesBalance2() {
		System.out.println("depositIncreasesBalance");
		int initialBalance = account.getBalance();
		account.deposit(100);
		//assertTrue(account.getBalance() > initialBalance);
		System.out.println("initialBalance " +initialBalance);
		assertThat(initialBalance == 0, is(true));
	}
	
	@Test
	public void depositIncreasesBalance3() {
		System.out.println("depositIncreasesBalance");
		int initialBalance = account.getBalance();
		account.deposit(100);
		//assertTrue(account.getBalance() > initialBalance);
		System.out.println("initialBalance " +initialBalance);
		assertThat(account.getBalance(), is(nullValue()));
	}
	
	@Test
	public void depositIncreasesBalance4() {
		System.out.println("depositIncreasesBalance");
		int initialBalance = account.getBalance();
		account.deposit(100);
		//assertTrue(account.getBalance() > initialBalance);
		System.out.println("initialBalance " +initialBalance);
		assertThat(account.getBalance() * 3, equalTo(100));
	}
}
