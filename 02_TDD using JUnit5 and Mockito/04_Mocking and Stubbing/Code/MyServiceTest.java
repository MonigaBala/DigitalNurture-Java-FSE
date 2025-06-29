package com.mockdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Unit test class for {@link MyService} using Mockito to mock the
 * {@link ExternalApi}.
 * <p>
 * This test class demonstrates the use of mocking and stubbing in unit testing.
 * It isolates the service layer by mocking the external dependency
 * {@code ExternalApi}, ensuring that the {@code MyService} behavior is
 * validated independently of external systems.
 * </p>
 *
 * @author MonigaBalasubramanian
 */
public class MyServiceTest {

	/**
	 * Tests the {@link MyService#fetchData()} method by mocking its dependency.
	 * <p>
	 * <strong>Test Scenario:</strong><br>
	 * - Arrange: Create a mock of {@link ExternalApi} and stub {@code getData()} to
	 * return a fixed string.<br>
	 * - Act: Call {@code fetchData()} using the mock.<br>
	 * - Assert: Verify the returned value matches the stubbed response.
	 * </p>
	 *
	 * <pre>
	 * Given: ExternalApi returns "Mock Data"
	 * When:  MyService.fetchData() is called
	 * Then:  It should return "Mock Data"
	 * </pre>
	 */
	@Test
	public void testExternalApi() {
		// Arrange: Create a mock API and define behavior
		ExternalApi mockApi = mock(ExternalApi.class);
		when(mockApi.getData()).thenReturn("Mock Data");

		// Act: Inject mock into service and call method
		MyService service = new MyService(mockApi);
		String result = service.fetchData();

		// Assert: Check if result matches stubbed value
		assertEquals("Mock Data", result);
	}
}
