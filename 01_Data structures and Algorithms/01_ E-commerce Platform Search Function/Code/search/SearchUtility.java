package com.ecommerce.search;

import com.ecommerce.model.Product;

/**
 * The {@code SearchUtility} class provides utility methods for performing
 * search operations on an array of {@link Product} objects. It supports both
 * linear and binary search algorithms and includes sorting functionality
 * required for binary search.
 * 
 * <p>
 * This class is designed to support efficient search functionality in an
 * e-commerce platform.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class SearchUtility {

	/**
	 * Performs a linear search on the given array of products to find a product by
	 * name.
	 * 
	 * <p>
	 * Time Complexity: O(n) in the worst case.
	 * </p>
	 * 
	 * @param products the array of products to search
	 * @param name     the name of the product to find (case-insensitive)
	 * @return the matching {@code Product} if found, or {@code null} if not found
	 */
	public static Product linearSearch(Product[] products, String name) {
		for (Product product : products) {
			if (product.getProductName().equalsIgnoreCase(name)) {
				return product;
			}
		}
		return null;
	}

	/**
	 * Performs a binary search on a sorted array of products to find a product by
	 * name.
	 * 
	 * <p>
	 * Note: The input array must be sorted in case-insensitive lexicographical
	 * order using {@link #sortProductsByName(Product[])} before calling this
	 * method.
	 * </p>
	 * 
	 * <p>
	 * Time Complexity: O(log n) in the worst case.
	 * </p>
	 * 
	 * @param products the sorted array of products to search
	 * @param name     the name of the product to find (case-insensitive)
	 * @return the matching {@code Product} if found, or {@code null} if not found
	 */
	public static Product binarySearch(Product[] products, String name) {
		int low = 0, high = products.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int comparison = products[mid].getProductName().compareToIgnoreCase(name);
			if (comparison == 0) {
				return products[mid];
			} else if (comparison < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return null;
	}

	/**
	 * Sorts the given array of products by their name in ascending case-insensitive
	 * lexicographical order. This sorting is required before performing a binary
	 * search.
	 * 
	 * <p>
	 * This method uses {@code Arrays.sort()} with a lambda comparator.
	 * </p>
	 * 
	 * @param products the array of products to sort
	 */
	public static void sortProductsByName(Product[] products) {
		java.util.Arrays.sort(products, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));
	}
}
