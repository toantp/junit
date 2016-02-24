package demo.junit2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import demo.junit2.AssertTest.Account;
import demo.junit2.AssertTest.InsufficientFundsException;

public class AssertHamcrestTest {
	private Account account;
	
	@Before
	public void initialized() {
		//account = new Account("sdasd");
		//account = new Account("");
	}
	
	@Test(expected=InsufficientFundsException.class)
	public void test() {
		account.withdraw(100);
	}
	
}
