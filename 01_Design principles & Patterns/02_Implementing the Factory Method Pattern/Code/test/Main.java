package com.factorymethods.test;

import com.factorymethods.documents.IDocument;
import com.factorymethods.enums.DocumentType;

import java.util.Scanner;

/**
 * Main class to test the Document Factory Method Pattern.
 * <p>
 * This program allows the user to create different types of documents (Word,
 * PDF, Excel) using the Factory Method design pattern. It displays a menu for
 * user interaction and performs the creation accordingly.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class Main {

	/**
	 * The entry point of the application. Displays a menu to the user and handles
	 * the creation of different document types.
	 *
	 * @param args the input arguments (not used)
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continueFlag = true;

		while (continueFlag) {
			System.out.println("===== Document Creation Menu =====");
			System.out.println("1. Create Word Document");
			System.out.println("2. Create PDF Document");
			System.out.println("3. Create Excel Document");
			System.out.println("4. Exit");
			System.out.print("Enter your choice (1-4): ");

			int choice = -1;
			try {
				choice = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a number.");
				continue;
			}

			DocumentType docType = null;

			switch (choice) {
			case 1:
				docType = DocumentType.WORD;
				break;
			case 2:
				docType = DocumentType.PDF;
				break;
			case 3:
				docType = DocumentType.EXCEL;
				break;
			case 4:
				System.out.println("Exiting program. Goodbye!");
				continueFlag = false;
				break;
			default:
				System.out.println("Invalid choice. Please select from 1 to 4.");
			}

			if (docType != null) {
				IDocument doc = docType.createDocument();
				System.out.println("Document Metadata: " + doc.getMetadata());
				System.out.println("-------------------------------------------------");
			}
		}

		scanner.close();
	}
}
