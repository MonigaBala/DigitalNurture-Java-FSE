package com.factorymethods.documents;

/**
 * Concrete implementation of the {@link IDocument} interface for Word
 * documents.
 * <p>
 * This class defines the specific behavior for Word documents, such as
 * simulating the generation process and providing document metadata.
 * </p>
 * 
 * @version 1.0
 * @author MonigaBalasubramanian
 */
public class WordDocument implements IDocument {

	/**
	 * Simulates the generation of a Word document. Prints a message to the console
	 * indicating that the document is being generated.
	 */
	@Override
	public void generate() {
		System.out.println("Generating a Word document...");
	}

	/**
	 * Returns metadata information about the Word document.
	 *
	 * @return a string containing the type, size, and author of the document
	 */
	@Override
	public String getMetadata() {
		return "Type: Word | Size: 500KB | Author: Moniga";
	}
}
