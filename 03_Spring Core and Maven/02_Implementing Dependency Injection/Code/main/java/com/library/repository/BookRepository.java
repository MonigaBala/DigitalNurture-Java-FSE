package com.library.repository;

/**
 * The {@code BookRepository} class handles the data access layer
 * for saving book-related information.
 *
 * <p>This class simulates saving a book by printing to the console.</p>
 *
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class BookRepository {

    /**
     * Saves the book with the given name.
     *
     * @param bookName the name of the book to be saved
     */
    public void saveBook(String bookName) {
        System.out.println("Book saved: " + bookName);
    }
}
