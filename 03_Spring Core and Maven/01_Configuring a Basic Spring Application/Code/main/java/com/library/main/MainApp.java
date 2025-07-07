package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

/**
 * The {@code MainApp} class serves as the entry point for the Library
 * Management application.
 *
 * <p>
 * It initializes the Spring application context using
 * {@code applicationContext.xml}, retrieves the {@code BookService} bean, and
 * performs a sample operation to add a book.
 * </p>
 * 
 * <p>
 * This demonstrates how Spring handles dependency injection using XML
 * configuration and manages application components.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class MainApp {

	/**
	 * Main method to launch the Library Management demo application.
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		// Load Spring context
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bookService bean
		BookService bookService = (BookService) context.getBean("bookService");

		// Call method
		bookService.addBook("The Alchemist");

		// Close context
		((ClassPathXmlApplicationContext) context).close();
	}
}
