package com.factorymethods.factories;

import com.factorymethods.documents.IDocument;
import com.factorymethods.documents.PdfDocument;

/**
 * Concrete factory class for creating {@link PdfDocument} instances.
 * <p>
 * This class implements the {@code createDocument()} method from the abstract
 * {@link DocumentFactory} to produce PDF documents.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class PdfDocumentFactory extends DocumentFactory {

	/**
	 * Creates a new instance of {@link PdfDocument}.
	 *
	 * @return a new PdfDocument object
	 */
	@Override
	public IDocument createDocument() {
		return new PdfDocument();
	}
}
