package com.assertiondemo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Demonstrates various JUnit assertions for testing logic and behavior.
 *
 * <p>
 * Assertions include equality, boolean conditions, and null checks.
 * </p>
 *
 * @author MonigaBalasubramanian
 */
public class AssertionsTest {

	/**
	 * This test method verifies the usage of various JUnit assertions. It includes
	 * checks for: - Equality - Boolean conditions (true/false) - Null and not-null
	 * conditions
	 */
	@Test
	public void testAssertions() {

		// Assert that two values are equal
		assertEquals("Sum check failed", 5, 2 + 3);

		// Assert that a condition is true
		assertTrue("Expected condition to be true", 5 > 3);

		// Assert that a condition is false
		assertFalse("Expected condition to be false", 5 < 3);

		// Assert that an object is null
		assertNull("Expected value to be null", null);

		// Assert that an object is not null
		assertNotNull("Expected object to be non-null", new Object());
	}
}
