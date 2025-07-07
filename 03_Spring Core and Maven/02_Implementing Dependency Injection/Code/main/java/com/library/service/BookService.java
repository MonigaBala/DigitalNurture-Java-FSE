package com.library.service;

import com.library.repository.BookRepository;

/**
 * The {@code BookService} class provides business logic related to managing
 * books in the library system.
 *
 * <p>
 * This service class is designed to demonstrate setter-based dependency
 * injection using Spring's IoC container.
 * </p>
 *
 * <p>
 * It delegates persistence operations to the {@link BookRepository} class.
 * </p>
 *
 * <p>
 * This class is part of Exercise 2: Implementing Dependency Injection for Week
 * 3 of the Cognizant Java FSE DeepSkilling Program.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.1
 */
public class BookService {

	private BookRepository bookRepository;

	/**
	 * Setter method used by Spring for dependency injection.
	 *
	 * @param bookRepository the {@code BookRepository} instance to inject
	 */
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	/**
	 * Adds a new book by delegating to the {@code BookRepository}.
	 *
	 * @param bookName the name of the book to add
	 */
	public void addBook(String bookName) {
		System.out.println("Adding book: " + bookName);
		bookRepository.saveBook(bookName);
	}
}
