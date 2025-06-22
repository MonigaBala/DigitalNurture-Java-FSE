package com.factorymethods.factories;

import com.factorymethods.documents.IDocument;
import com.factorymethods.documents.WordDocument;

/**
 * Concrete factory class for creating {@link WordDocument} instances.
 * <p>
 * This class extends the abstract {@link DocumentFactory} and provides the
 * implementation of the {@code createDocument()} method to create Word document
 * objects.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class WordDocumentFactory extends DocumentFactory {

	/**
	 * Creates a new instance of {@link WordDocument}.
	 *
	 * @return a new WordDocument object
	 */
	@Override
	public IDocument createDocument() {
		return new WordDocument();
	}
}
