package com.forecasting.util;

import java.util.Scanner;

/**
 * The {@code InputUtility} class provides utility methods for safely and
 * interactively receiving validated user input from the console.
 * <p>
 * It ensures that inputs meet specified minimum constraints and handles
 * incorrect formats gracefully using exception handling.
 * <p>
 * This class is intended for use in console-based applications where user
 * interaction is required for numeric inputs.
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 * 
 */
public class InputUtility {

	// Scanner for reading input from the console
	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * Prompts the user for a decimal (double) input with a minimum allowed value.
	 * <p>
	 * Re-prompts until a valid double greater than or equal to {@code min} is
	 * entered.
	 *
	 * @param prompt the message displayed to the user
	 * @param min    the minimum acceptable value (inclusive)
	 * @return a valid double value greater than or equal to {@code min}
	 */
	public static double getValidatedDoubleInput(String prompt, double min) {
		while (true) {
			try {
				System.out.print(prompt);
				double value = Double.parseDouble(scanner.nextLine());
				if (value < min) {
					System.out.printf("❌ Value must be ≥ %.2f%n", min);
					continue;
				}
				return value;
			} catch (NumberFormatException e) {
				System.out.println("❌ Invalid input. Please enter a decimal number.");
			}
		}
	}

	/**
	 * Prompts the user for an integer input with a minimum allowed value.
	 * <p>
	 * Re-prompts until a valid integer greater than or equal to {@code min} is
	 * entered.
	 *
	 * @param prompt the message displayed to the user
	 * @param min    the minimum acceptable value (inclusive)
	 * @return a valid integer value greater than or equal to {@code min}
	 */
	public static int getValidatedIntInput(String prompt, int min) {
		while (true) {
			try {
				System.out.print(prompt);
				int value = Integer.parseInt(scanner.nextLine());
				if (value < min) {
					System.out.printf("❌ Value must be ≥ %d%n", min);
					continue;
				}
				return value;
			} catch (NumberFormatException e) {
				System.out.println("❌ Invalid input. Please enter an integer.");
			}
		}
	}

	/**
	 * Closes the shared {@code Scanner} instance.
	 * <p>
	 * This method should be called when input operations are complete to release
	 * system resources.
	 */
	public static void closeScanner() {
		scanner.close();
	}
}
