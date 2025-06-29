package com.mockdemo;

/**
 * Service class that depends on an external API to fetch data.
 */
public class MyService {

	private final ExternalApi api;

	/**
	 * Constructs MyService with the specified ExternalApi.
	 *
	 * @param api the external API dependency
	 */
	public MyService(ExternalApi api) {
		this.api = api;
	}

	/**
	 * Fetches data by delegating to the external API.
	 *
	 * @return the fetched data
	 */
	public String fetchData() {
		return api.getData();
	}
}
