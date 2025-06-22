package com.singletonpattern.util;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Singleton Logger utility class for writing log messages to a file with
 * support for different log levels and timestamped output.
 * <p>
 * Ensures only a single instance of the logger is used throughout the
 * application lifecycle. This implementation is thread-safe using
 * double-checked locking.
 * </p>
 * 
 * <p>
 * Log messages are written to a file named <code>application.log</code>. You
 * can control the verbosity of the output by setting a desired
 * {@link LogLevel}.
 * </p>
 * 
 * Example usage:
 * 
 * <pre>
 * Logger logger = Logger.getInstance();
 * logger.setLogLevel(LogLevel.WARNING);
 * logger.log(LogLevel.INFO, "This is an info message."); // This won't be logged
 * logger.log(LogLevel.ERROR, "An error occurred."); // This will be logged
 * </pre>
 * 
 * @author MonigaBalasubramanian
 */
public class Logger {

	/** Singleton instance of the Logger. */
	private static volatile Logger instance;

	/** Path to the log file. */
	private static final String LOG_FILE = "application.log";

	/** Current minimum level of logs that will be recorded. */
	private static LogLevel logLevel = LogLevel.INFO;

	/**
	 * Private constructor to prevent instantiation from outside the class.
	 * Initializes the Logger.
	 */
	private Logger() {
		System.out.println("Logger initialized");
	}

	/**
	 * Returns the singleton instance of the Logger. Uses double-checked locking to
	 * ensure thread safety.
	 *
	 * @return the single instance of Logger
	 */
	public static Logger getInstance() {
		if (instance == null) {
			synchronized (Logger.class) {
				if (instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
	}

	/**
	 * Sets the minimum log level. Messages below this level will be ignored.
	 *
	 * @param level the new log level to set
	 */
	public void setLogLevel(LogLevel level) {
		logLevel = level;
	}

	/**
	 * Logs a message with the specified log level, if it meets the current log
	 * threshold. Messages are timestamped and appended to the log file.
	 *
	 * @param level   the severity level of the log message
	 * @param message the message to log
	 */
	public void log(LogLevel level, String message) {
		if (shouldLog(level)) {
			String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			String formatted = String.format("[%s] [%s] %s", timeStamp, level, message);

			try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
				writer.write(formatted + "\n");
			} catch (IOException e) {
				System.err.println("Logging failed: " + e.getMessage());
			}
		}
	}

	/**
	 * Determines whether a message with the given log level should be logged based
	 * on the current log level setting.
	 *
	 * @param level the level of the incoming log message
	 * @return true if the message should be logged, false otherwise
	 */
	private boolean shouldLog(LogLevel level) {
		return level.ordinal() >= logLevel.ordinal();
	}
}
