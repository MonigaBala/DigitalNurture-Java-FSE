package com.interaction;

/**
 * Business service class that uses an external API to retrieve data.
 */
public class MyService {

	private final ExternalApi api;

	/**
	 * Constructs the service with an injected external API.
	 *
	 * @param api the external dependency
	 */
	public MyService(ExternalApi api) {
		this.api = api;
	}

	/**
	 * Fetches data from the external API.
	 *
	 * @return the fetched data
	 */
	public String fetchData() {
		return api.getData();
	}
}
