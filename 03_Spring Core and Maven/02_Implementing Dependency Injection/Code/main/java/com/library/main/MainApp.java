package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

/**
 * The {@code MainApp} class serves as the entry point for testing dependency
 * injection in the Library Management application using Spring's Inversion of
 * Control (IoC) container.
 *
 * <p>
 * It loads the Spring context from {@code applicationContext.xml}, retrieves
 * the {@code BookService} bean, and adds a sample book to demonstrate
 * successful dependency injection.
 * </p>
 * 
 * <p>
 * This is part of Exercise 2: Implementing Dependency Injection for Week 3 in
 * the Cognizant Java FSE DeepSkilling Program.
 * </p>
 * 
 * @author Moniga Balasubramanian
 * @version 1.1
 */
public class MainApp {

	/**
	 * Main method to launch the Library Management application. Demonstrates
	 * Spring's setter-based dependency injection.
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		// Load Spring context from XML configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve BookService bean from Spring container
		BookService bookService = (BookService) context.getBean("bookService");

		// Use the service to add a book
		bookService.addBook("Wings of Fire");

		// Close Spring context
		((ClassPathXmlApplicationContext) context).close();
	}
}
