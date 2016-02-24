package demo.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		TestClassOne.class,
        TestClassTwo.class
})
public class JunitTest3 {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
