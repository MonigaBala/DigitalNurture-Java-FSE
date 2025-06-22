package com.singletonpattern.test;

import com.singletonpattern.util.LogLevel;
import com.singletonpattern.util.Logger;

import java.util.Scanner;

/**
 * Interactive test class for demonstrating the Singleton Logger.
 * <p>
 * This version allows the user to set the log level at runtime and enter
 * multiple log messages with different severity levels.
 * </p>
 * 
 * Example:
 * 
 * <pre>
 * Enter Log Level (INFO/WARNING/ERROR): WARNING
 * Enter log message (or type 'exit' to finish): Something happened
 * Enter level of this message (INFO/WARNING/ERROR): INFO
 * --> Skipped (below threshold)
 * </pre>
 * 
 * Logs are written to 'application.log'.
 * 
 * @author MonigaBalasubramanian
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Logger logger = Logger.getInstance();

		// Set initial log level from user input
		System.out.print("Enter Log Level (INFO/WARNING/ERROR): ");
		String inputLevel = scanner.nextLine().trim().toUpperCase();

		try {
			LogLevel level = LogLevel.valueOf(inputLevel);
			logger.setLogLevel(level);
			System.out.println("Log level set to " + level);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid log level. Defaulting to INFO.");
			logger.setLogLevel(LogLevel.INFO);
		}

		// Interactive logging
		while (true) {
			System.out.print("\nEnter log message (or type 'exit' to finish): ");
			String message = scanner.nextLine().trim();
			if (message.equalsIgnoreCase("exit"))
				break;

			System.out.print("Enter level of this message (INFO/WARNING/ERROR): ");
			String msgLevelInput = scanner.nextLine().trim().toUpperCase();

			try {
				LogLevel msgLevel = LogLevel.valueOf(msgLevelInput);
				logger.log(msgLevel, message);
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid message level. Skipped.");
			}
		}

		System.out.println("\nLogging session ended. Check application.log for output.");
		scanner.close();
	}
}
