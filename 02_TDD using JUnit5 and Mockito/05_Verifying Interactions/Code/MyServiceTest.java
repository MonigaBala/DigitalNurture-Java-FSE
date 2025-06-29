package com.mockverify;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import com.interaction.ExternalApi;
import com.interaction.MyService;

/**
 * Unit test to verify interaction between {@link MyService} and
 * {@link ExternalApi}.
 * <p>
 * This test ensures that when {@code MyService.fetchData()} is called, it
 * internally calls {@code getData()} on the mocked {@code ExternalApi}.
 * </p>
 *
 * <p>
 * <strong>Author:</strong> Moniga Balasubramanian
 * </p>
 */
public class MyServiceTest {

	/**
	 * Verifies that {@link ExternalApi#getData()} is called exactly once during the
	 * execution of {@code fetchData()} in {@link MyService}.
	 */
	@Test
	public void testVerifyInteraction() {
		// Arrange
		ExternalApi mockApi = mock(ExternalApi.class);
		MyService service = new MyService(mockApi);

		// Act
		service.fetchData();

		// Assert (Interaction)
		verify(mockApi).getData();
	}
}
