package com.aaademo;

/**
 * The {@code Calculator} class provides basic arithmetic operations such as
 * addition and subtraction.
 * <p>
 * This class is used to demonstrate the Arrange-Act-Assert (AAA) pattern and
 * unit testing with JUnit, including setup and teardown methods.
 * </p>
 *
 * @author MonigaBalasubramanian
 */
public class Calculator {

	/**
	 * Adds two integer numbers.
	 *
	 * @param a the first operand
	 * @param b the second operand
	 * @return the result of {@code a + b}
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * Subtracts the second number from the first.
	 *
	 * @param a the number to subtract from
	 * @param b the number to be subtracted
	 * @return the result of {@code a - b}
	 */
	public int subtract(int a, int b) {
		return a - b;
	}
}
