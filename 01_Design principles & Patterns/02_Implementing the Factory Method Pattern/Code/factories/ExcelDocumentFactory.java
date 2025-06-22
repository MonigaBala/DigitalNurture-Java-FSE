package com.factorymethods.factories;

import com.factorymethods.documents.IDocument;
import com.factorymethods.documents.ExcelDocument;

/**
 * Concrete factory class for creating {@link ExcelDocument} instances.
 * <p>
 * This class extends {@link DocumentFactory} and provides the implementation of
 * the {@code createDocument()} method to instantiate Excel documents.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class ExcelDocumentFactory extends DocumentFactory {

	/**
	 * Creates a new instance of {@link ExcelDocument}.
	 *
	 * @return a new ExcelDocument object
	 */
	@Override
	public IDocument createDocument() {
		return new ExcelDocument();
	}
}
