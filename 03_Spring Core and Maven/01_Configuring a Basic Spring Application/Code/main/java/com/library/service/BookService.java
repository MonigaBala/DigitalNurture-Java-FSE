package com.library.service;

import com.library.repository.BookRepository;

/**
 * The {@code BookService} class provides service-level operations related to
 * books in the library management system.
 *
 * <p>
 * This class contains business logic to add a book and delegates data storage
 * operations to {@link BookRepository}.
 * </p>
 *
 * <p>
 * The dependency is injected via a setter method, suitable for Spring's
 * XML-based configuration.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class BookService {

	private BookRepository bookRepository;

	/**
	 * Setter-based dependency injection for {@code BookRepository}.
	 *
	 * @param bookRepository the repository to be injected
	 */
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	/**
	 * Adds a book to the library by delegating to {@code BookRepository}.
	 *
	 * @param bookName the name of the book to be added
	 */
	public void addBook(String bookName) {
		System.out.println("Adding book: " + bookName);
		bookRepository.saveBook(bookName);
	}
}
