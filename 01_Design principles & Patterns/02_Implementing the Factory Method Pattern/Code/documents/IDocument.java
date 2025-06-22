package com.factorymethods.documents;

/**
 * Interface representing a generic document in the document management system.
 * <p>
 * All specific types of documents (e.g., Word, PDF, Excel) must implement this
 * interface and define the behavior for generating the document and retrieving
 * its metadata.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public interface IDocument {

	/**
	 * Generates the content of the document.
	 * <p>
	 * This method should contain logic for simulating or creating the actual
	 * document output, such as writing to a file or printing to the console.
	 * </p>
	 */
	void generate();

	/**
	 * Returns metadata information about the document.
	 * <p>
	 * This could include details such as document type, size, author, or creation
	 * date.
	 * </p>
	 *
	 * @return a string containing metadata about the document
	 */
	String getMetadata();
}
