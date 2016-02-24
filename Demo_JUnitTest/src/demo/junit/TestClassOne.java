package demo.junit;

import junit.framework.TestCase;

public class TestClassOne extends TestCase {

	public TestClassOne(String method) {
		super(method);
	}

	public void testAddition() {
		assertEquals(4, 2 + 2);
	}

	public void testSubtraction() {
		assertEquals(0, 2 - 2);
	}

}
