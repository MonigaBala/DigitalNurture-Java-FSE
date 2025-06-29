package com.mockdemo;

/**
 * The {@code ExternalApi} interface represents an abstraction of a third-party
 * or external system that provides data to the application.
 * <p>
 * This interface is typically implemented by classes that communicate with
 * external services such as REST APIs, databases, or file systems. In testing
 * scenarios, it can be mocked using frameworks like Mockito to isolate
 * dependencies and simulate controlled responses.
 * </p>
 *
 * @author MonigaBalasubramanian
 */
public interface ExternalApi {

	/**
	 * Fetches data from the external system.
	 *
	 * @return a {@code String} containing the retrieved data.
	 */
	String getData();
}
