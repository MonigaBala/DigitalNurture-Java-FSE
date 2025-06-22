package com.forecasting.main;

import com.forecasting.service.ForecastCalculator;
import com.forecasting.util.InputUtility;

/**
 * The {@code ForecastMain} class serves as the entry point for the Financial
 * Forecasting Tool application. It collects user input for the present value,
 * growth rate, and number of years, and then calculates and displays the future
 * value using a recursive forecasting algorithm.
 * <p>
 * This class follows a console-based interaction model and validates user
 * input.
 *
 * @author MonigaBalasubramanian
 * @version 1.0
 * 
 */
public class ForecastMain {

	/**
	 * The main method of the application.
	 * <p>
	 * It initializes user interaction, performs input validation, invokes the
	 * forecast calculation, and displays the output.
	 *
	 * @param args the command-line arguments (not used)
	 */
	public static void main(String[] args) {

		System.out.println("🔮 Welcome to Financial Forecasting Tool 🔮");

		// Get validated input values from user
		double presentValue = InputUtility.getValidatedDoubleInput("Enter Present Value (₹): ", 0.01);
		double growthRate = InputUtility.getValidatedDoubleInput("Enter Annual Growth Rate (e.g., 0.05 for 5%): ", 0.0);
		int years = InputUtility.getValidatedIntInput("Enter number of years: ", 0);

		// Create calculator object and perform recursive forecast
		ForecastCalculator calculator = new ForecastCalculator();
		double result = calculator.calculateFutureValue(presentValue, growthRate, years);

		// Display result
		System.out.printf("\n📈 Forecast Value after %d years: ₹%.2f%n", years, result);

		// Clean up resources
		InputUtility.closeScanner();
		System.out.println("✅ Forecasting complete. Thank you!");
	}
}
