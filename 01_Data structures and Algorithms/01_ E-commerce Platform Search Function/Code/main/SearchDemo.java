package com.ecommerce.main;

import java.util.Scanner;

import com.ecommerce.model.Product;
import com.ecommerce.search.SearchUtility;

/**
 * The {@code SearchDemo} class serves as the main entry point for demonstrating
 * product search functionality in an e-commerce platform.
 * 
 * <p>
 * This class accepts user input to create an array of {@link Product} objects,
 * then allows the user to search for a product by name using either linear
 * search or binary search.
 * </p>
 * 
 * <p>
 * <strong>Usage Flow:</strong>
 * </p>
 * <ul>
 * <li>Accepts product details from the user</li>
 * <li>Prompts for a search term</li>
 * <li>Prompts for a search method (linear or binary)</li>
 * <li>Displays the result of the search</li>
 * </ul>
 * 
 * <p>
 * This demo highlights the difference between O(n) linear search and O(log n)
 * binary search (after sorting).
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class SearchDemo {

	/**
	 * Main method to run the product search demo.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of products: ");
		int n = Integer.parseInt(scanner.nextLine());
		Product[] products = new Product[n];

		// Input loop for product details
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for product " + (i + 1) + ":");

			System.out.print("Product ID: ");
			int id = Integer.parseInt(scanner.nextLine());

			System.out.print("Product Name: ");
			String name = scanner.nextLine();

			System.out.print("Category: ");
			String category = scanner.nextLine();

			products[i] = new Product(id, name, category);
		}

		// Prompt for search term
		System.out.print("\nEnter product name to search: ");
		String searchTerm = scanner.nextLine();

		// Choose search method
		System.out.println("Choose search method:");
		System.out.println("1. Linear Search");
		System.out.println("2. Binary Search");
		System.out.print("Enter choice (1 or 2): ");
		int choice = Integer.parseInt(scanner.nextLine());

		Product result = null;

		switch (choice) {
		case 1:
			result = SearchUtility.linearSearch(products, searchTerm);
			break;

		case 2:
			// Binary search requires sorting first
			SearchUtility.sortProductsByName(products);
			result = SearchUtility.binarySearch(products, searchTerm);
			break;

		default:
			System.out.println("Invalid choice.");
			break;
		}

		// Display result
		if (result != null) {
			System.out.println("\nFound: " + result);
		} else {
			System.out.println("\nProduct not found.");
		}

		scanner.close();
	}
}
