package com.bptn.course._08_opp_demo;

class Product {

	private String productId;
	private String productName;
	private double productPrice;
	private int productQuantity;

	public Product(String productId, String productName, double productPrice, int productQuantity) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	// Getter

	public String getProducId() {
		return this.productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public double getProductPrice() {
		return this.productPrice;
	}

	public int getProductQuantity() {
		return this.productQuantity;
	}

	public void reduceStockProduct(int quantity) {
		if (quantity <= this.productQuantity) {
			this.productQuantity -= quantity;
		} else {
			throw new IllegalArgumentException("Insufficient Stock!");
		}
	}

}
