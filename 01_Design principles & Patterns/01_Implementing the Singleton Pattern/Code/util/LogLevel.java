package com.singletonpattern.util;

/**
 * Enum representing the severity levels for logging messages.
 * <p>
 * These levels can be used to control the verbosity of log output. The levels
 * are ordered by increasing severity:
 * <ul>
 * <li>{@code INFO} - General informational messages.</li>
 * <li>{@code WARNING} - Messages indicating potential issues or important
 * notices.</li>
 * <li>{@code ERROR} - Messages indicating serious problems or failures.</li>
 * </ul>
 * This enum is typically used in conjunction with a logging utility to filter
 * and display log messages based on the currently configured log level.
 * </p>
 *
 * @author MonigaBalasubramanian
 */
public enum LogLevel {
	INFO, // Low severity - general information
	WARNING, // Medium severity - potential problems
	ERROR // High severity - serious errors
}
