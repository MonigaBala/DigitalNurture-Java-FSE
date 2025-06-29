package com.aaademo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test class for the {@link Calculator} using JUnit.
 * <p>
 * This class demonstrates the Arrange-Act-Assert (AAA) pattern for organizing
 * test logic. It also uses JUnit's {@code @Before} and {@code @After}
 * annotations to set up and clean up resources before and after each test case.
 * </p>
 *
 * @author MonigaBalasubramanian
 */
public class CalculatorTest {

	/** Instance of Calculator used for testing */
	private Calculator calculator;

	/**
	 * Initializes the {@link Calculator} instance before each test method. This
	 * method is run automatically by JUnit before every {@code @Test}.
	 */
	@Before
	public void setUp() {
		calculator = new Calculator();
		System.out.println("Setup: Calculator initialized");
	}

	/**
	 * Cleans up the Calculator instance after each test method. This method is run
	 * automatically by JUnit after every {@code @Test}.
	 */
	@After
	public void tearDown() {
		calculator = null;
		System.out.println("Teardown: Calculator cleaned up");
	}

	/**
	 * Tests the {@link Calculator#add(int, int)} method using the
	 * Arrange-Act-Assert pattern.
	 * <ul>
	 * <li><b>Arrange:</b> Set input values {@code a = 10}, {@code b = 20}</li>
	 * <li><b>Act:</b> Call the {@code add()} method</li>
	 * <li><b>Assert:</b> Expect result to be {@code 30}</li>
	 * </ul>
	 */
	@Test
	public void testAddition() {
		// Arrange
		int a = 10;
		int b = 20;

		// Act
		int result = calculator.add(a, b);

		// Assert
		assertEquals(30, result);
	}

	/**
	 * Tests the {@link Calculator#subtract(int, int)} method using the
	 * Arrange-Act-Assert pattern.
	 * <ul>
	 * <li><b>Arrange:</b> Set input values {@code a = 25}, {@code b = 10}</li>
	 * <li><b>Act:</b> Call the {@code subtract()} method</li>
	 * <li><b>Assert:</b> Expect result to be {@code 15}</li>
	 * </ul>
	 */
	@Test
	public void testSubtraction() {
		// Arrange
		int a = 25;
		int b = 10;

		// Act
		int result = calculator.subtract(a, b);

		// Assert
		assertEquals(15, result);
	}
}
