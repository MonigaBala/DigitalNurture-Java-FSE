package com.testdemo;

/**
 * The {@code Calculator} class provides basic arithmetic operations such as
 * addition, subtraction, multiplication, and division.
 * <p>
 * This class is intended for demonstrating unit testing using JUnit.
 * </p>
 *
 * @author MonigaBalasubramanian
 * 
 */
public class Calculator {

	/**
	 * Adds two integers.
	 *
	 * @param a the first number
	 * @param b the second number
	 * @return the sum of {@code a} and {@code b}
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * Subtracts the second number from the first.
	 *
	 * @param a the number to subtract from
	 * @param b the number to subtract
	 * @return the result of {@code a - b}
	 */
	public int subtract(int a, int b) {
		return a - b;
	}

	/**
	 * Multiplies two integers.
	 *
	 * @param a the first number
	 * @param b the second number
	 * @return the product of {@code a} and {@code b}
	 */
	public int multiply(int a, int b) {
		return a * b;
	}

	/**
	 * Divides the first number by the second.
	 *
	 * @param a the dividend
	 * @param b the divisor
	 * @return the result of {@code a / b}
	 * @throws IllegalArgumentException if {@code b} is zero
	 */
	public int divide(int a, int b) {
		if (b == 0)
			throw new IllegalArgumentException("Cannot divide by zero");
		return a / b;
	}
}
