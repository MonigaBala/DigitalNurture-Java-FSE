package com.ecommerce.model;

/**
 * The {@code Product} class represents a product entity in the e-commerce
 * platform. It contains essential attributes used in search operations such as
 * productId, productName, and category.
 * 
 * <p>
 * This class supports both constructor-based and setter-based object creation
 * to allow flexibility during data input, making it suitable for use in
 * console-based input as well as object mappers in larger systems.
 * </p>
 * 
 * @author MonigaBalasubramanian
 * @version 1.0
 */
public class Product {

	/** The unique identifier for the product. */
	private int productId;

	/** The name of the product used in search operations. */
	private String productName;

	/** The category to which the product belongs. */
	private String category;

	/**
	 * Default no-argument constructor. Required for object mappers and manual
	 * property setting via setters.
	 */
	public Product() {
		super();
	}

	/**
	 * Constructs a product with the specified ID, name, and category.
	 *
	 * @param productId   the unique identifier for the product
	 * @param productName the name of the product
	 * @param category    the category to which the product belongs
	 */
	public Product(int productId, String productName, String category) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
	}

	/**
	 * Gets the product ID.
	 *
	 * @return the product ID
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * Sets the product ID.
	 *
	 * @param productId the product ID to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * Gets the product name.
	 *
	 * @return the product name
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the product name.
	 *
	 * @param productName the name of the product to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Gets the category of the product.
	 *
	 * @return the product category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the product category.
	 *
	 * @param category the category of the product to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Returns a string representation of the product.
	 *
	 * @return a string containing the product ID, name, and category
	 */
	@Override
	public String toString() {
		return productId + " - " + productName + " (" + category + ")";
	}
}
