package demo.junit;

import junit.extensions.RepeatedTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestClassComposite extends TestCase {

	public TestClassComposite(String method) {
		super(method);
	}

	public void testNumberFormatException() {
		String a = "1a";
		try {
			Integer.parseInt(a);
		} catch (NumberFormatException e) {
			fail("Expected NumberFormatException because string is not number");
		}
	}
}
