package com.factorymethods.enums;

import com.factorymethods.factories.*;
import com.factorymethods.documents.IDocument;

/**
 * Enum representing the different types of documents that can be created.
 * <p>
 * Each enum constant (WORD, PDF, EXCEL) is associated with its respective
 * {@link DocumentFactory} implementation to create the appropriate document.
 * </p>
 * <p>
 * The enum also provides a convenient method {@link #createDocument()} to
 * create and generate a document instance directly.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public enum DocumentType {

	/**
	 * Represents a Word document type. Uses {@link WordDocumentFactory} for
	 * creation.
	 */
	WORD {
		@Override
		public DocumentFactory getFactory() {
			return new WordDocumentFactory();
		}
	},

	/**
	 * Represents a PDF document type. Uses {@link PdfDocumentFactory} for creation.
	 */
	PDF {
		@Override
		public DocumentFactory getFactory() {
			return new PdfDocumentFactory();
		}
	},

	/**
	 * Represents an Excel document type. Uses {@link ExcelDocumentFactory} for
	 * creation.
	 */
	EXCEL {
		@Override
		public DocumentFactory getFactory() {
			return new ExcelDocumentFactory();
		}
	};

	/**
	 * Abstract method that must be implemented by each document type to return its
	 * specific document factory.
	 *
	 * @return the corresponding {@link DocumentFactory}
	 */
	public abstract DocumentFactory getFactory();

	/**
	 * Creates and generates a document using the factory associated with the
	 * document type.
	 *
	 * @return a new instance of a class implementing {@link IDocument}
	 */
	public IDocument createDocument() {
		return getFactory().generateDocument();
	}
}
