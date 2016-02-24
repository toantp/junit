package demo.junit.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCase {

	private Collection<String> collection;

	@Before
	public void setUp() {
		collection = new ArrayList<String>();
	}

	@After
	public void tearDown() throws Exception {
		collection.clear();	
	}

	@Test
	public void testEmptyCollection() {
		assertTrue(collection.isEmpty());
	}

	@Test
	public void testOneItemCollection() {
		collection.add("itemA");
		assertEquals(1, collection.size());
	}
}
