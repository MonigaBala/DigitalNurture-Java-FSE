package com.factorymethods.factories;

import com.factorymethods.documents.IDocument;

/**
 * Abstract factory class for creating document instances.
 * <p>
 * This class defines the factory method {@code createDocument()} which must be
 * implemented by concrete factories to produce specific document types. It also
 * includes a template method {@code generateDocument()} that handles
 * post-creation steps like document generation.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public abstract class DocumentFactory {

	/**
	 * Factory method to be implemented by subclasses to create specific types of
	 * documents (e.g., Word, PDF, Excel).
	 *
	 * @return a new instance of a class implementing {@link IDocument}
	 */
	public abstract IDocument createDocument();

	/**
	 * Template method that creates a document and calls its {@code generate()}
	 * method. This provides a common post-creation process for all document types.
	 *
	 * @return the generated document instance
	 */
	public IDocument generateDocument() {
		IDocument document = createDocument();
		document.generate();
		return document;
	}
}
