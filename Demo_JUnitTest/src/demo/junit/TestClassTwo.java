package demo.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestClassTwo extends TestCase {

	public TestClassTwo(String method) {
		super(method);
	}

	public void testLongRunner1() {
		assertEquals(2300, 2300);
	}
	
	public void testLongRunner2() {
		assertEquals(9, 9);
	}

	public static Test suite() {
		TestSuite suite = new TestSuite();
		
		suite.addTest(new TestClassTwo("testLongRunner1"));
		return suite;
	}
}
