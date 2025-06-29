package com.interaction;

/**
 * Represents an external system providing data.
 */
public interface ExternalApi {

	/**
	 * Fetches data from an external source.
	 *
	 * @return data as a String
	 */
	String getData();
}
