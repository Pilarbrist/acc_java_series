/**
 * 
 */
package com.isburgh.x;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author pi
 *
 */
public class MainTest {

	String x;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("in setUp()");
		x = com.isburgh.x.TestedClass.getValue();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("in tearDown()");
	}

	@Test
	public void testDude() {
		System.out.println("in testDude()");
		String expected = "Dude";
		assertEquals( expected, x);
	}

}
