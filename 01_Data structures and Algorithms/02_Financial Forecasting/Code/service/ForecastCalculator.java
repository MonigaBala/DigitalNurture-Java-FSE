package com.forecasting.service;

/**
 * The {@code ForecastCalculator} class provides methods to calculate the future
 * value of an investment using both standard recursion and tail recursion.
 * <p>
 * The formula used is:
 * 
 * <pre>
 *     Future Value = Present Value × (1 + Growth Rate)^Years
 * </pre>
 * 
 * This class is used in financial forecasting applications to predict future
 * returns based on historical growth rates.
 * 
 * @author MonigaBalsubramanian
 * @version 1.0
 * @since 2025-06-22
 */
public class ForecastCalculator {

	/**
	 * Calculates the future value using a standard recursive method.
	 *
	 * @param presentValue the initial amount of investment
	 * @param growthRate   the annual growth rate (e.g., 0.05 for 5%)
	 * @param years        the number of years to forecast
	 * @return the calculated future value after the given number of years
	 */
	public double calculateFutureValue(double presentValue, double growthRate, int years) {
		if (years == 0)
			return presentValue;
		return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
	}

	/**
	 * Calculates the future value using a tail-recursive approach.
	 * <p>
	 * Tail recursion is more optimized for some languages, although Java does not
	 * perform tail call optimization. This version is useful for conceptual clarity
	 * and stack efficiency in other contexts.
	 *
	 * @param presentValue the initial amount of investment
	 * @param growthRate   the annual growth rate (e.g., 0.05 for 5%)
	 * @param years        the number of years to forecast
	 * @return the calculated future value after the given number of years
	 */
	public double calculateFutureValueTail(double presentValue, double growthRate, int years) {
		return calculateTailRecursive(presentValue, growthRate, years, presentValue);
	}

	/**
	 * Private helper method for tail-recursive calculation.
	 *
	 * @param pv          the original present value (unchanged across calls)
	 * @param rate        the annual growth rate
	 * @param years       the remaining years to forecast
	 * @param accumulated the accumulated value so far
	 * @return the final future value after all recursive calls complete
	 */
	private double calculateTailRecursive(double pv, double rate, int years, double accumulated) {
		if (years == 0)
			return accumulated;
		return calculateTailRecursive(pv, rate, years - 1, accumulated * (1 + rate));
	}
}
