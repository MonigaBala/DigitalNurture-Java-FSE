package com.testdemo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test class for {@link Calculator}.
 * <p>
 * This class uses JUnit 4 to test basic arithmetic operations including
 * addition, subtraction, multiplication, and division.
 * </p>
 *
 * @author MonigaBalasubramanian
 */
public class CalculatorTest {

	/** Calculator instance used for testing */
	Calculator calculator = new Calculator();

	/**
	 * Tests the addition of two positive integers. Verifies that 2 + 3 = 5.
	 */
	@Test
	public void testAddition() {
		assertEquals(5, calculator.add(2, 3));
	}

	/**
	 * Tests the subtraction of two integers. Verifies that 5 - 3 = 2.
	 */
	@Test
	public void testSubtraction() {
		assertEquals(2, calculator.subtract(5, 3));
	}

	/**
	 * Tests the multiplication of two integers. Verifies that 3 * 5 = 15.
	 */
	@Test
	public void testMultiplication() {
		assertEquals(15, calculator.multiply(3, 5));
	}

	/**
	 * Tests the division method with divisor as zero. Expects an
	 * {@link IllegalArgumentException} to be thrown.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testDivisionByZero() {
		calculator.divide(10, 0);
	}

	/**
	 * Tests the division of two integers. Verifies that 20 / 5 = 4.
	 */
	@Test
	public void testDivision() {
		assertEquals(4, calculator.divide(20, 5));
	}
}
