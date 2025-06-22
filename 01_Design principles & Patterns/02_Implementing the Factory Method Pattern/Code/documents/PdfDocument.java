package com.factorymethods.documents;

/**
 * Concrete implementation of the {@link IDocument} interface for PDF documents.
 * <p>
 * This class provides behavior specific to PDF documents, such as simulating
 * document generation and returning relevant metadata.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class PdfDocument implements IDocument {

	/**
	 * Simulates the generation of a PDF document. Prints a message to the console
	 * indicating that the document is being generated.
	 */
	@Override
	public void generate() {
		System.out.println("Generating a PDF document...");
	}

	/**
	 * Returns metadata information about the PDF document.
	 *
	 * @return a string containing the type, size, and author of the document
	 */
	@Override
	public String getMetadata() {
		return "Type: PDF | Size: 1MB | Author: Moniga";
	}
}
