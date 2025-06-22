package com.factorymethods.documents;

/**
 * Concrete implementation of the {@link IDocument} interface for Excel
 * documents.
 * <p>
 * This class provides behavior specific to Excel documents, such as simulating
 * document generation and returning metadata related to the document.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class ExcelDocument implements IDocument {

	/**
	 * Simulates the generation of an Excel document. Prints a message to the
	 * console indicating that the document is being generated.
	 */
	@Override
	public void generate() {
		System.out.println("Generating an Excel document...");
	}

	/**
	 * Returns metadata information about the Excel document.
	 *
	 * @return a string containing the type, size, and author of the document
	 */
	@Override
	public String getMetadata() {
		return "Type: Excel | Size: 700KB | Author: Moniga";
	}
}
